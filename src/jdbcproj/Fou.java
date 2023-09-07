
	package jdbcproj;
	import java.sql.*;

	public class Fou{

		public static void main(String[] args) throws Exception {
			
			//programe using PreparedStatement
				Connection con;
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded and registered");
				
				
				con=DriverManager.getConnection("jdbc:mysql://localhost/hi", "root", "Akhila@123");
				System.out.println("connection is established");
				
				
				PreparedStatement ps=con.prepareStatement("update employees set salary=(?) where id=(?)");
				ps.setDouble(1, 25.500);
				ps.setInt(2, 10);
				int  val=ps.executeUpdate();
				System.out.println("update row is: "+val);
				ps.close();
				con.close();
				
		}	
}