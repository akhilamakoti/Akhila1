package jdbcproj;
import java.sql.*;
import java.util.*;
public class Assignment2{

public static void main(String[] args) throws Exception{
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	
	con=DriverManager.getConnection("jdbc:mysql://localhost/hello", "root", "Akhila@123");
	System.out.println("connection is established");
	
	PreparedStatement ps=con.prepareStatement("insert into employee(id,name) values(?,?)");
	System.out.println("enter employee id=");
	Scanner sc=new Scanner(System.in);
	int ab=sc.nextInt();
	
	
	System.out.println("enter employee name=");
	Scanner sc1=new Scanner(System.in);
	String bc=sc1.nextLine();
	
	
	ps.setInt(1,ab);
	ps.setString(2, bc);
	int n=ps.executeUpdate();
    System.out.println("updated rows :"+n);
    ps.close();
    con.close();
}
}
