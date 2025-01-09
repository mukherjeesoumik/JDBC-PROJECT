import java.sql.*;

public class MEtaData {
    private static String url = "jdbc:postgresql://localhost:5432/jspiders";
    private static final String user = "postgres";
    private static final String pass = "123";

    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url,user,pass);

            String sql = "SELECT * from Student";
            Statement stmt = connection.createStatement();


           DatabaseMetaData metadata = connection.getMetaData();

            System.out.println(metadata.getDatabaseProductName());
            System.out.println(metadata.getDriverName());
            System.out.println(metadata.getDriverVersion());
            System.out.println(metadata.getDatabaseProductVersion());

            ResultSet resultset = stmt.executeQuery(sql);

            ResultSetMetaData data = resultset.getMetaData();

            System.out.println(data.getColumnCount());
            System.out.println(data.getColumnName(1));
            System.out.println(data.getTableName(1));

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e1){
            e1.printStackTrace();
        }
    }
}

