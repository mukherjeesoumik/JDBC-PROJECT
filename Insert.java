import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    private static final String url = "jdbc:postgresql://localhost:5432/jspiders";
    private static final String user = "postgres";
    private static final String pass = "123";

    public static void main(String[] args) {
        try {
            // 1st Step: Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // 2nd Step: Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, user, pass);

            // 3rd Step: Create a statement object to execute SQL queries
            Statement stmt = connection.createStatement();

            // 4th Step: Define the SQL query to insert data
            String sql = "insert into student values(102, 'SOUMIK', 25)"; // id(PK) , name , age

            // 5th Step: Execute the SQL query
            stmt.execute(sql);
            System.out.println("Data Saved!");

            // 6th Step: Close the connection
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
