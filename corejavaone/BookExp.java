package corejavaone;
import java.util.Scanner;

public class BookExp {
	
 public static void main(String[] args) {
	        // Array of available books
	        String[] books = {"Java", "Python", "C++", "HTML", "Data Structures"};
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter book name to search: ");
	            String inputBook = sc.nextLine();

	            boolean found = false;

	            // Check if book is in the list
	            for (String book : books) {
	                if (book.equals(inputBook)) {
	                    found = true;
	                  
	                }
	            }

	            if (found) {
	                System.out.println("Book is available.");
	            } else {
	                // Throw an exception if not found
	                throw new Exception(" Book not found in the list.");
	            }

	        } catch (Exception e) {
	            System.out.println(" Exception: " + e.getMessage());
	        } finally {
	            System.out.println("Book search completed.");

	            sc.close(); // Closing the scanner
	        }
	    }
	
}
