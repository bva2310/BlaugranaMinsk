package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

        private static final String URL = "jdbc:mysql://localhost:3306";

        private static final String USER = "root";

        private static final String PASSWORD = "burik2310";


        public static Connection newConnection() throws SQLException {
                return DriverManager.getConnection(URL, USER, PASSWORD);
        }
}