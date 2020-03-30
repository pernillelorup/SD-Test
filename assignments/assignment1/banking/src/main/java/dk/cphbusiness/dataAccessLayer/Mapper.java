package dk.cphbusiness.dataAccessLayer;

import dk.cphbusiness.banking.RealAccount;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    /*public void createAccount() {
        try {
            //Connect to db

            String sql = "INSERT INTO accounts (cvr, cpr, number, balance, movements) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, account.getBank().getCvr());
            ps.setString(2, account.getCustomer().getCpr());
            ps.setString(3, account.getNumber());
            ps.setString(4, account.getBalance());
            // Movements?

            ps.executeUpdate();

        } catch (SQLException e) {

        }
    }


    public RealAccount getAccountFromNumber(String number) {
        try {
            //Connect to db

            String sql = "SELECT * FROM accounts WHERE number =?;";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, number);
            ResultSet resultset = ps.executeQuery();

            ps.close();
        } catch (SQLException | ClassNotFoundException ex) {
        }
        return account;
    }*/

}
