package banking;

import java.util.List;

public interface Account {

    public Bank getBank();
    public Customer getCustomer();
    public String getNumber();
    public double getBalance();
    public void addMovement(Account source, Account target, double amount);
    public void updateBalance(double amount);
    public List<Movement> getMovements();
    public void transfer(double amount, Account target);
    public void transfer(double amount, String targetNumber);
}
