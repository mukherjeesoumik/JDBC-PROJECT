import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    private static final String url = "jdbc:postgresql://localhost:5432/jspiders";
    private static final String user = "postgres";
    private static final String pass = "123";

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement stmt = connection.createStatement();


            String query = "delete from student where id = 102";

            int rs = stmt.executeUpdate(query);

            if (rs > 0) {
                System.out.println("Data deleted successfully");
            } else {
                System.out.println("Data not deleted");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
