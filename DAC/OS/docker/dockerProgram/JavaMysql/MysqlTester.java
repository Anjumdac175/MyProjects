import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * MysqlTester
 */
public class MysqlTester {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://mysql-container:3306/dac","root","Nishadanjum@625");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Users");
            ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    System.out.println("Username:" + rs.getString(1));
                    System.out.println("Password:" + rs.getString(2));
                    System.out.println("Role:" + rs.getString(3));
                    System.out.println("Balance:" + rs.getString(4));
                }
            }
    }
}