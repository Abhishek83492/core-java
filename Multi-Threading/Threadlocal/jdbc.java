import java.sql.*;

public class Metadata {

	public static void main(String[] args)throws Exception 
	{
     Class.forName("com.jdbc.mysql.driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Abhi","root","root");
     DatabaseMetaData dbst = con.getMetaData();
     System.out.println("product name:"+dbst.getDatabaseProductName());
     System.out.println("product Version:"+dbst.getDatabaseProductVersion());
     con.close();
	}
}