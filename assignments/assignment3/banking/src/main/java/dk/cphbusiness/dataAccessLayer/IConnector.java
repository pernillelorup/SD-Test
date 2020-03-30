package dk.cphbusiness.dataAccessLayer;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConnector {

    public Connection connection();

    }
