package Day8.dbUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnector {

    public Connection getOracleConnection() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:hr:HR@//109.241.162.43:7531/orcapdb", "hr", "HR");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return con;
        }
    }
}






