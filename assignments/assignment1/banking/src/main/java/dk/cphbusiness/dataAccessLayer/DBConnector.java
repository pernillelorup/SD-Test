package dk.cphbusiness.dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    /*private static final String URL = "jdbc:postgresql://localhost:5432/banking";

    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgresqlsuper";

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            Class.forName("org.postgresql.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }*/

}
