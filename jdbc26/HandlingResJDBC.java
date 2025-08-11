package jdbc26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		ResultSetMetaData data = rs.getMetaData();
	
		
		int col=data.getColumnCount();	
	    
			
			while(rs.next()) {
	  
	    	//basic syntax 
	    	/*int id=rs.getInt("personsID");
	    	System.out.println(id);
	    	
	    	String s=rs.getString("Firstnmae");
	    	System.out.println(s);*/
	    	 {
	    		 for(int i=1;i<+col;i++) {
	    			 String value=rs.getString(i);
	    			 System.out.println(value +"\t");
	    		
	    		 }
	
	          System.out.println();
	    	}
	    }

	}

}
