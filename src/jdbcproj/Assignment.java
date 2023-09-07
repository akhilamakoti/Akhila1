package jdbcproj;
import java.sql.*;
public class Assignment {
	public static void main(String[] args) throws Exception {
        Statement st;
       Connection con;
       ResultSet res;
       
       
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded and registered");
		
		
		con=DriverManager.getConnection("jdbc:mysql://localhost/hi", "root", "Akhila@123");
		System.out.println("connection is established");
		
		
		st=con.createStatement();
		st.execute("update employees set salary=29000 where id=11");
		
		res=st.executeQuery("select * from employees");
		
		
		for(int i=0;i<=4;i++) {
			res.next();
			double slr=res.getDouble(2);
			int a=res.getInt(1);
			System.out.println("id is: "+a);
			System.out.println("salary is: "+slr);
			
		}
st.close();
con.close();
res.close();
	}
}