package banking;

import java.util.List;

public class AccountDummy implements Account {
    @Override
    public Bank getBank() {
        return null;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public String getNumber() {
        return null;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void addMovement(Account source, Account target, double amount) {

    }

    @Override
    public void updateBalance(double amount) {

    }

    @Override
    public List<Movement> getMovements() {
        return null;
    }

    @Override
    public void transfer(double amount, Account target) {

    }

    @Override
    public void transfer(double amount, String targetNumber) {

    }
}
