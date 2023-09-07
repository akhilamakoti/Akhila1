package jdbcproj;
import java.sql.*;
public class Classlabel1 {
	public static void main(String[] args) throws Exception{
		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost/aa", "root", "Akhila@123");
		System.out.println(".connection is established");
		
		CallableStatement cs=con.prepareCall("{call PROC(?,?)}");
		cs.setInt(1,14);
        cs.registerOutParameter(2,Types.VARCHAR);
        cs.execute();
        String st=cs.getString(2);
        System.out.println("Mobile name is: "+st);
        cs.close();
        con.close();
}
}