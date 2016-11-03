package agenda.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by gusta on 03/11/2016.
 */
public class DBRepo {
    private static Connection connection = null;
    private static final String HOST = "jdbc:mysql://localhost/agenda";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if(connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(HOST, USER, PASSWORD);
        }
        return connection;
    }

}
