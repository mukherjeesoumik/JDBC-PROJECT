import java.sql.*;

public class Update {
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

            String sql = "update student set name=? where=?";

            PreparedStatement pstm = connection.prepareStatement(sql);

            pstm.setString(104,"ISHIKA");

            pstm.executeBatch();
            System.out.println("Data Updated.. !!");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
