import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database URL, Username, Password
            String url = "jdbc:mysql://localhost:3306/movie_booking";
            String username = "root";
            String password = "root";

            // Establish Connection
            con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found!");
        } catch (SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }

        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }
}