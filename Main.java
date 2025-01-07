import java.sql.*;
public class Main {

    private static final String url="";
    String username;
    String password;
    public static void main(String[] args) {
        try {
            Class.forName("org.Postgresql.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
