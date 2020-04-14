package banking;

import java.util.List;

public interface Customer {
    void transfer(double amount, Account account, Customer target);
    String getCpr();
    List<Account> getAccounts();
    List<Movement> getMovementsFromAccount(String accountNumber);

    }
