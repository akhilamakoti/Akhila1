package jdbcproj;
import java.sql.*;

public class one {

public static void main(String[] args) throws SQLException,ClassNotFoundException{
	Statement st;
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	con=DriverManager.getConnection("jdbc:mysql://localhost/two", "root", "Akhila@123");
	System.out.println("connection is established");
    st.close();
    con.close();
    
}
}
