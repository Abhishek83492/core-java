import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class oracle{
    public static void main(String[] args) {
        try {
            Properties pros = new Properties();
            InputStream fis = new FileInputStream("D:\\"+args[0]+".properties");
            pros.load(fis);
            String Drivername = pros.getProperty("k1");
            //System.out.println(Drivername);
            String url = pros.getProperty("k2");
            String un = pros.getProperty("k3");
            String pw = pros.getProperty("k4");
            Class.forName(Drivername);
            Connection con = DriverManager.getConnection(url, un, pw);
            System.out.println("Driver Is Loaded With"+" "+ Drivername);
            System.out.println("--------------Connection is Opened with DataBase-------------");
            Statement smt = con.createStatement();
            Properties pros1 = new Properties();
            InputStream fis1 = new FileInputStream("D:\\"+args[1]+".properties");
            pros1.load(fis1);
            String sql = pros1.getProperty("k5");
            //System.out.println(sql);
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("id :" + rs.getInt(1) + "|"+"name:" + rs.getString(2));
            }
            con.close();
            System.out.println("--------------Connection is closed with DataBase---------------");
            fis1.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}