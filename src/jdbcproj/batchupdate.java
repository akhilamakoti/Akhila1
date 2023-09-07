package jdbcproj;
import java.sql.*;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;
public class  batchupdate{

public static void main(String[] args) throws SQLException,ClassNotFoundException{
	Statement st;
	Connection con;
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded and registered");
	con=DriverManager.getConnection("jdbc:mysql://localhost/rak","root","Akhila@123");
	System.out.println("connection is established");
	st=con.createStatement();
    for(int id=1;id<=50;id++)
	{
	st.addBatch("insert into mobiles values(id,'redmi')");
	}
int zz[]=Executebatch();
System.out.println("batch is executed and number of rows updated "+zz.length);
    st.close();
    con.close();
    
}

private static int[] Executebatch() {
	// TODO Auto-generated method stub
	return null;
}
//create table employee(id INT auto_increment PRIMARY KEY,name varchar(20));


}


