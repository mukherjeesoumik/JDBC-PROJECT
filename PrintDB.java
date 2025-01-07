import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class PrintDB {
    private static String url = "jdbc:postgresql://localhost:5432/jspiders";
    private static final String user = "postgres";
    private static final String pass = "123";

    public static void display(){
        try{
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(url,user,pass);

            Statement stmt = connection.createStatement();
            String query = "select * from student";
            ResultSet rs = stmt.executeQuery(query); // cursor

            while (rs.next()){
                int id = rs.getInt(1); // c1  --> // int id = rs.getInt("id");
                String name = rs.getString(2); //c2
                int age = rs.getInt(3); //c3

                System.out.println("ID : " + id);
                System.out.println("NAME : " + name);
                System.out.println("AGE : " + age);

                System.out.println("``````````````");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e1){
            e1.printStackTrace();
        }
    }
    public static void main(String[] args) {
        display();

    }
}

