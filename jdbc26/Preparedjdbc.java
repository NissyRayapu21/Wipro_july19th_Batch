package jdbc26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparedjdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		 //fetch the db url,password,username of my sql
			String dbURL="jdbc:mysql://localhost:3306/2607clsdb";
			String username="root";
			String password="Nissy@21";
			//load the my sql driver file
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection(dbURL, username, password);
			
			Statement st=con.createStatement();
			//execute the parameterized queries
			
			String query="select *from persons WHERE FirstNmae=?";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1,"puli");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("FirstNmae"));
				System.out.println(rs.getString("LastNmae"));
			}
			
			//execute the select with two parameter
			String query1="select *from persons where FirstNmae='puli' and personId='1'";
			String query2="select * from persons where FirstNmae = ? and personsID = ?";
			PreparedStatement ps1=con.prepareStatement(query2);
			//set the parameters
			ps1.setString(1,"Puli");
			ps1.setInt(2, 1);
			ResultSet rs1=ps1.executeQuery();
			while(rs1.next()) {
				System.out.println(rs1.getString("personsID"));
				System.out.println(rs1.getString("FirstNmae"));
				System.out.println(rs1.getString("LastNmae"));
				System.out.println(rs1.getString("Address"));
			}
			
			//insert
			String query3="insert into persons VALUES(?,?,?,?)";
			PreparedStatement ps3=con.prepareStatement(query3);
			ps3.setInt(1,1);
			ps3.setString(2,"Puli");
			ps3.setString(3,"Chintu");
			ps3.setString(4, "nagar");
		
		     int result=ps3.executeUpdate();
			
				 System.out.println("success");
			}
			
			
			
	
}
