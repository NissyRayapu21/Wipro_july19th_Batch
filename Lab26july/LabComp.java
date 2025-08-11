package Lab26july;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LabComp {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		 //fetch the db url,password,username of my sql
			String dbURL="jdbc:mysql://localhost:3306/lab29";
			String username="root";
			String password="Nissy@21";
			//load the my sql driver file
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection(dbURL, username, password);
			
			/*Statement st=con.createStatement();
			//execute the queries
			//create
			String createTableQuery="Create a table("
				   + "id INT PRIMARY KEY,"
	                + "name VARCHAR(50),"
					+" department VARCHAR(50),"
	               +"salary DOUBLE"+")";
			 st.executeUpdate(createTableQuery);
			 System.out.println("table employees created");*/
			
	        // ----- INSERT -----
	        String insertQuery = "INSERT INTO employees VALUES (?, ?, ?, ?)";
	        PreparedStatement pstmtInsert = con.prepareStatement(insertQuery);
	        pstmtInsert.setInt(1,501);
	        pstmtInsert.setString(2, "Alice");
	        pstmtInsert.setString(3, "HR");
	        pstmtInsert.setDouble(4, 1000);
	       
	       //
	        pstmtInsert.setInt(1,102);
	        pstmtInsert.setString(2,"Bob");
	        pstmtInsert.setString(3, "IT");
	        pstmtInsert.setDouble(4, 2000);
	        //
	        pstmtInsert.setInt(1,403);
	        pstmtInsert.setString(2, "Charlie");
	        pstmtInsert.setString(3, "Sales");
	        pstmtInsert.setDouble(4, 3000);
	        pstmtInsert.executeUpdate();
	      
	        System.out.println("Inserted new employee.");

	     // ----- SELECT ALL -----
	        String selectAllQuery = "SELECT * FROM employees";
	        Statement st1 = con.createStatement();
	        ResultSet rs = st1.executeQuery(selectAllQuery);
	        System.out.println("\nAll Employees:");
	        while (rs.next()) {
	            System.out.println(rs.getInt("id") + "-" +
	                               rs.getString("name") + "-" +
	                               rs.getString("department") + "-" +
	                               rs.getDouble("salary"));  
	        }

	  // SELECT WHERE id = 102
	        String selectdQuery = "SELECT * FROM employees WHERE id = ?";
	        PreparedStatement pstmtSelect = con.prepareStatement(selectdQuery);
	        pstmtSelect.setInt(1, 102);
	        ResultSet rs1 = pstmtSelect.executeQuery();
	        System.out.println("\nEmployee with ID 102:");
	        while (rs1.next()) {
	            System.out.println(rs1.getInt("id")+" - " +
	                               rs1.getString("name")+" - " +
	                               rs1.getString("department")+" - " +
	                               rs1.getDouble("salary"));  
	        }

	       //SELECT WHERE department = 'IT' 
	        String selectQuery = "SELECT * FROM employees WHERE department = ?";
	        PreparedStatement pstmtSelect1 = con.prepareStatement(selectQuery);
	        pstmtSelect1.setString(1, "IT");
	        ResultSet rsd = pstmtSelect1.executeQuery();
	        System.out.println("\nEmployees in IT Department:");
	        while (rsd.next()) {
	            System.out.println(rsd.getInt("id")+" - " +
	                               rsd.getString("name")+" - " +
	                               rsd.getString("department")+" - " +
	                               rsd.getDouble("salary"));  
	        }
	    


	        // UPDATE salary WHERE id = 102 
	        String updateSalaryQuery = "UPDATE employees SET salary = ? WHERE id = ?";
	        PreparedStatement psUpdateSal= con.prepareStatement(updateSalaryQuery);
	        psUpdateSal.setDouble(1, 70000);
	        psUpdateSal.setInt(2, 102);
	        psUpdateSal.executeUpdate();
	        System.out.println("\nUpdated for id 102");  

	        // UPDATE department WHERE name = 'Bob'
	        String updateDeptQuery = "UPDATE employees SET department = ? WHERE name = ?";
	        PreparedStatement pstmtUpdateDept = con.prepareStatement(updateDeptQuery);
	        pstmtUpdateDept.setString(1, "Head");
	        pstmtUpdateDept.setString(2, "Bob");
	        pstmtUpdateDept.executeUpdate();
	        System.out.println("Updated department");
	     

	        // DELETE WHERE id = 103 
	        String deleteQuery = "DELETE FROM employees WHERE id = ?";
	        PreparedStatement pstmtDelete = con.prepareStatement(deleteQuery);
	        pstmtDelete.setInt(1, 301);
	        pstmtDelete.setInt(1, 401);
	        pstmtDelete.executeUpdate();
	        System.out.println("Deleted employee with ID 103,104");

	        //DELETE WHERE department = 'Sales' 
	        String deleteQueryDept = "DELETE FROM employees WHERE department = ?";
	        PreparedStatement pstmtDeleteDept = con.prepareStatement(deleteQueryDept);
	        pstmtDeleteDept.setString(1,"Sales");
	        pstmtDeleteDept.executeUpdate();
	        System.out.println("Deleted all employees in Sales department.");  

	        // Close connections
	        con.close();
	    
	       
	    }
		
		}
		
		



