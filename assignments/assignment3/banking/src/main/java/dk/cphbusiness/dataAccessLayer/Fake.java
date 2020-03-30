package dk.cphbusiness.dataAccessLayer;

import java.sql.Connection;

public class Fake implements IConnector {
    @Override
    public Connection connection() {
        return null;
    }
}
