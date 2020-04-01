package dk.cphbusiness.miscellaneous;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.Customer;
import dk.cphbusiness.banking.Movement;

import java.util.List;

public class BaseCustomer implements Customer {
  public BaseCustomer(String number, String name) { }

  @Override
  public void transfer(double amount, Account account, Customer target) {

  }

  @Override
  public String getCpr() {
    return null;
  }

  @Override
  public List<Account> getAccounts() {
    return null;
  }

  @Override
  public List<Movement> getMovementsFromAccount(String accountNumber) {
    return null;
  }
}
