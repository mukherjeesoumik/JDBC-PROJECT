import java.sql.*;

public class AddInsert {
    private static final String url = "jdbc:postgresql://localhost:5432/jspiders";
    private static final String user = "postgres";
    private static final String pass = "123";

    public static void main(String[] args) {
        try {

            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url, user, pass);

            String sql = "insert into student values(?,?,?)";

            PreparedStatement pstm = connection.prepareStatement(sql);

            pstm.setInt(1,101);
            pstm.setString(2,"PAVAN");
            pstm.setInt(3,2);

            pstm.addBatch();

            pstm.setInt(1,100);
            pstm.setString(2,"VENKY");
            pstm.setInt(3,22);

            pstm.addBatch();

            pstm.executeBatch();
            System.out.println("Data Saved !!");

            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
