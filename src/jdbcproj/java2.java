
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
				
				
				PreparedStatement ps=con.prepareStatement("update mobiles set name=(?) where id=(?)");
				for(int i=1;i<=2000;i++)
				{
				ps.addBatch("insert into mobiles values(10,redmi)");
				ps.addBatch("insert into mobiles values(11,oppo)");
				ps.addBatch("insert into mobiles values(12,apple)");
				ps.addBatch("insert into mobiles values(13,realmi)");
			    ps.addBatch("insert into mobiles values(14,samsung)");
				ps.addBatch("insert into mobiles values(15,narzo)");
				ps.addBatch("insert into mobiles values(16,oneplus)");
				ps.addBatch("insert into mobiles values(17,moto)");
				}
			int zz[]=Executebatch();
			System.out.println("batch is executed and number of rows updated "+zz.length);
			    ps.close();
			    con.close();
				
		}

		private static int[] Executebatch() {
			// TODO Auto-generated method stub
			return null;
		}	
}