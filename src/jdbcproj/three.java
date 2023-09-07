
	package jdbcproj;
	import java.sql.*;

	public class three {

		public static void main(String[] args) throws Exception {
			
				Statement st;
				Connection con;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded and registered");
				
				con=DriverManager.getConnection("jdbc:mysql://localhost/two", "root", "Akhila@123");
				System.out.println("connection is established");
				
				st=con.createStatement();
				st.execute("delete from mobilestore where id=10");
				System.out.println("row deleted");
				
				st.close();
				con.close();
}
	}
