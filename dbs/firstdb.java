import java.sql.*;
public class firstdb {
    public static void main(String args[])
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1520:xe","C2132507","AA");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next())  
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
               
            }
              con.close();  
        }
        catch(Exception e)
        {
                System.out.println(e);
        }
    }
}
