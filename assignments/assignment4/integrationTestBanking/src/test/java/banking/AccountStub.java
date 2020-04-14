package banking;

import java.util.List;

public class AccountStub implements Account {
    private String number;
    private double balance = 0;

    public AccountStub(String number, double balance){
        this.number = number;
        this.balance = balance;
    }

    public AccountStub(String number) {
        this(number, 0);
    }

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
        return number;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void addMovement(Account source, Account target, double amount) {
    }

    @Override
    public void updateBalance(double amount) {
        balance += amount;
    }

    @Override
    public List<Movement> getMovements() {
        return null;
    }

    @Override
    public void transfer(double amount, Account target) {
        updateBalance(-amount);
        target.updateBalance(amount);
    }

    @Override
    public void transfer(double amount, String targetNumber) {

    }
}
