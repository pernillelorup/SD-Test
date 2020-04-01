package dk.cphbusiness.dataAccessLayer;

import dk.cphbusiness.banking.Account;
import java.util.List;

public interface IDBFacade {

    public void createDatabase(String sql) throws IllegalArgumentException;
    public List<String> getTableNames();
    public void deleteDatabase() throws Exception;
    public Account addAccount(Account account) throws Exception;
    public Account getAccount(String number);
    public Account updateAccount(Account account) throws Exception;
    public Account deleteAccount(String number) throws Exception;

}
