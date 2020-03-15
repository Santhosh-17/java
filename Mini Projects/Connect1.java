package mp;
import java.sql.*;

public class Connect1 {
	
	
	public void connect(String s1,String s2) throws Exception
	{
					
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Santhosh2001");
			PreparedStatement ps = con.prepareStatement("INSERT INTO PhoneBook VALUES (?,?)");
			ps.setString(1,s1);
			
			ps.setString(2,s2);
			ps.executeUpdate();
			
			con.commit();
			con.close();
	}
	
	
	

}
