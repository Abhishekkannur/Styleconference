package jdbc;
import java.sql.*;

public class DBConnector {
	public static final String UPDATE_USERS_SQL="update employee;";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest","root","5656");
			//Statement stmt=con.createStatement();
			//ResultSet rs=stmt.executeQuery("select * from employee");
			//while(rs.next())
			//	System.out.println(rs.getInt(1)+"    |"+ rs.getString(2)+"   | "+rs.getInt(3));
			PreparedStatement stmt=con.prepareStatement("UPDATE_USERS_SQL");
			stmt.setInt(1, 222);
			stmt.setString(2, "anand");
			stmt.setInt(3, 25100);
			stmt.setString(4, "India");
			int i =stmt.executeUpdate();
			System.out.println(i+"records added to the Table");
					
					
			con.close();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		// TODO Auto-generated method stub

	}

}
