package dk.cphbusiness.banking;

import dk.cphbusiness.dataAccessLayer.IDBFacade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class DBFacadeTest {

    public static final String ACC1 = "11111111";
    public static final String ACC2 = "22222222";
    public static final double BAL1 = 23;
    private final IDBFacade facade;
    public static boolean failDelete = false;

    public DBFacadeTest() {
        this.facade = new FakeDBFacade();
    }

    @Before
    public void setUp() throws Exception {
        String sql = Util.loadSqlAsString();
        facade.createDatabase(sql);
    }

    @After
    public void tearDown() throws Exception {
        DBFacadeTest.failDelete = false;
        facade.deleteDatabase();
    }

    /*@Test
    public void testCreateDatabase() {
        String sql = Util.loadSqlAsString();
        facade.createDatabase(sql);
        assertTrue(true);
    }*/

    @Test(expected = IllegalArgumentException.class)
    public void testCreateDatabaseBadSql() {
        String sql = "Create_I_Do_Not_Work";
        facade.createDatabase(sql);
    }

    @Test
    public void testGetTableNames(){
        List<String> tableNames1 = facade.getTableNames();
        List<String> tableNames = new ArrayList<>();
        tableNames.add("accounts");
        tableNames.add("customers");
        tableNames.add("banks");
        tableNames.add("movements");
        for (String name:tableNames
             ) {
            assertTrue(tableNames1.contains(name));
        }
    }

    /*@Test
    public void testDeleteDatabase() throws Exception {
        facade.deleteDatabase();
        assertTrue(true);
    }*/

    @Test(expected = Exception.class)
    public void testDeleteDatabaseFails() throws Exception {
            DBFacadeTest.failDelete = true;
            facade.deleteDatabase();
    }

    @Test
    public void testAddAccount() throws Exception {
        Account account = new AccountStub(ACC2, BAL1);
        Account returnAccount = facade.addAccount(account);
        assertEquals(account, returnAccount);
    }

    @Test(expected = Exception.class)
    public void testAddAccountAlreadyExists() throws Exception {
        Account account = new AccountStub(ACC1, BAL1);
        Account returnAccount = facade.addAccount(account);
    }

    @Test
    public void testGetAccount(){
        Account account = facade.getAccount(ACC1);
        assertEquals(ACC1, account.getNumber());
    }

    @Test
    public void testGetAccountNotExists(){
        Account account = facade.getAccount(ACC2);
        assertNull(account);
    }

    @Test
    public void testUpdateAccount() throws Exception {
        Account account = new AccountStub(ACC1, BAL1);
        Account newAccount = facade.updateAccount(account);
        assertEquals(account, newAccount);
    }

    @Test(expected = Exception.class)
    public void testUpdateAccountNotExists() throws Exception {
        Account account = new AccountStub(ACC2, BAL1);
        facade.updateAccount(account);
    }

    @Test
    public void testDeleteAccount() throws Exception {
        Account account = new AccountStub(ACC1, BAL1);
        Account deletedAccount = facade.deleteAccount(ACC1);
        assertEquals(account.getNumber(), deletedAccount.getNumber());
    }

    @Test(expected = Exception.class)
    public void testDeleteAccountNotExists() throws Exception {
        Account deletedAccount = facade.deleteAccount(ACC2);
    }

}
