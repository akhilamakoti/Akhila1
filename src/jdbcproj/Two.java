package jdbcproj;
import java.sql.*;

public class Two {

	public static void main(String[] args) throws Exception {
		
			Statement st;
			Connection con;
			ResultSet res;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded and registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost/two", "root", "Akhila@123");
			System.out.println("connection is established");
			st=con.createStatement();
			res=st.executeQuery("select name,id,cost from mobiles");	
		    res.next();
		    int i=res.getInt(2);
		    String ss=res.getString(1);
		    int j=res.getInt(3);
		    System.out.println("mobile id is: "+i);
		    System.out.println("mobile name is: "+ss);
		    System.out.println("mobile cost is: "+j);
		    res.close();
		    st.close();
		    con.close();
		}
		

	}


