package jdbcproj;
import java.sql.*;

public class Scrollableresult {
	public static void main(String[] args) throws Exception{
	Statement st;
	Connection con;
	ResultSet rs;
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	con=DriverManager.getConnection("jdbc:mysql://localhost/rak", "root", "Akhila@123");
	System.out.println("connection is established");
			
   st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
   rs=st.executeQuery("select*from mobiles");
   
   rs.first();
   int i=rs.getInt(1);
   String ss=rs.getString(2);
   System.out.println("id no is"+i);
   System.out.println("id no is"+ss);
 
   rs.absolute(3);
   int ii=rs.getInt(1);
   String s=rs.getString(2);
   System.out.println("id no is"+ii);
   System.out.println("id no is"+s);
 
   rs.previous();
   int ij1=rs.getInt(1);
   String ss1=rs.getString(2);
   System.out.println("id no is"+ij1);
   System.out.println("id no is"+ss1);
 
   rs.next();
   int ij=rs.getInt(1);
   String ss12=rs.getString(2);
   System.out.println("id no is"+ij);
   System.out.println("id no is"+ss12);
   
   rs.last();
   int ij2=rs.getInt(1);
   String ss2=rs.getString(2);
   System.out.println("id no is"+ij2);
   System.out.println("id no is"+ss2);
 
   rs.close();
   st.close();
   con.close();
	}
}
 


 
		
