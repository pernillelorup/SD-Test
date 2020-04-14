package banking;

import java.util.Date;

public class Movement {

    private Account source;
    private Account target;
    private double amount;
    private Date timestamp;

    public Movement(Account source, Account target, double amount, Date timestamp) {
        this.source = source;
        this.target = target;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Account getSource() {
        return source;
    }

    public Account getTarget() {
        return target;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }


}