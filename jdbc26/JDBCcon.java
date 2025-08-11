package jdbc26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCcon {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
 //fetch the db url,password,username of my sql
	String dbURL="jdbc:mysql://localhost:3306/2607clsdb";
	String username="root";
	String password="Nissy@21";
	//load the my sql driver file
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con=DriverManager.getConnection(dbURL, username, password);
	
	Statement st=con.createStatement();
	//execute the queries
	String selectquery="select *from persons;";
	//pass the selectquery to result
	
	ResultSet rs = st.executeQuery(selectquery);
     while (rs.next()) {
    	 
    	 System.out.println(rs.getString("Address"));
    	 System.out.println(rs.getString("FirstNmae"));
    	 System.out.println(rs.getString("personsID"));
    	 
    	 
     }
		

	}

}
