package dk.cphbusiness.banking;

import dk.cphbusiness.dataAccessLayer.IDBFacade;

import java.util.ArrayList;
import java.util.List;

public class FakeDBFacade implements IDBFacade {
    @Override
    public void createDatabase(String sql) throws IllegalArgumentException {
        String realSql = Util.loadSqlAsString();
        if(!sql.equals(realSql)) throw new IllegalArgumentException();
    }

    @Override
    public List<String> getTableNames() {
        List<String> tableNames = new ArrayList<>();
        tableNames.add("accounts");
        tableNames.add("customers");
        tableNames.add("banks");
        tableNames.add("movements");
        return tableNames;
    }

    @Override
    public void deleteDatabase() throws Exception{
        if(DBFacadeTest.failDelete) throw new Exception();
    }

    @Override
    public Account addAccount(Account account) throws Exception {
        if(isRealAccount(account.getNumber())) throw new Exception();
        return account;
    }

    @Override
    public Account getAccount(String number) {
        if(!isRealAccount(number)) return null;
        return new AccountStub(number, 0);
    }

    @Override
    public Account updateAccount(Account account) throws Exception {
        if(!isRealAccount(account.getNumber())) throw new Exception();
        return account;
    }

    @Override
    public Account deleteAccount(String number) throws Exception {
        if(!isRealAccount(number)) throw new Exception();
        return new AccountStub(number, 0);
    }

    private boolean isRealAccount(String number){
        return number.equals(DBFacadeTest.ACC1);
    }
}
