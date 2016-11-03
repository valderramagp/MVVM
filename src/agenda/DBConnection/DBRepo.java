package agenda.DBConnection;
import java.sql.*;

/**
 * Created by gusta on 03/11/2016.
 */
public class DBRepo {
    private static Connection connection = null;
    public static DBRepo db;
    private Statement statement;
    private static final String HOST = "jdbc:mysql://localhost/agenda";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private DBRepo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(HOST, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DBRepo getConnection() {
        if(db == null) {
            db = new DBRepo();
        }
        return db;
    }

    public ResultSet query(String query) throws SQLException {
        statement = db.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        return rs;
    }

    public int insert(String query) throws SQLException {
        statement = db.connection.createStatement();
        int result = statement.executeUpdate(query);
        return result;
    }

}
