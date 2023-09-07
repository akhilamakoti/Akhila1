
	package jdbcproj;
	import java.sql.*;

	public class four {

		public static void main(String[] args) throws Exception {
		
			
				Statement st;
				Connection con;
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("driver loaded and registered");
				con=DriverManager.getConnection("jdbc:mysql://localhost/two", "root", "Akhila@123");
				System.out.println("connection is established");
				st=con.createStatement();
				st.execute("insert into mobilestore values(10,'samsung')");
				st.execute("update mobilestore set id=15");
				System.out.println("row updated");
				st.close();
				con.close();
}
	}
