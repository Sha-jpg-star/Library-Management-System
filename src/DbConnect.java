import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library_db", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

