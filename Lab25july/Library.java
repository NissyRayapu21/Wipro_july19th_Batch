package Lab25july;

public class Library {
	 private String title;
	 private String author;
	 private String isbn;
     private boolean isAvailable = true;
     
     // Setters
     public void setTitle(String title) {
         this.title = title;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public void setIsbn(String isbn) {
         this.isbn = isbn;
     }

     public void setAvailable(boolean available) {
         isAvailable = available;
     }
    
     // Issue book
     public void issueBook() {
         if (isAvailable) {
             isAvailable = false;
             System.out.println("Book " + title + " has issued.");
         } else {
             System.out.println("Book " + title + " is already issued.");
         }
     }

     // Return book
     public void returnBook() {
         if (!isAvailable) {
             isAvailable = true;
             System.out.println("Book " + title + " has returned.");
         } else {
             System.out.println("Book " + title + "is already available.");
         }
     }
/// Display book info
     public void displayInfo() {
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("ISBN: " + isbn);
         System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
      
     }
 
  

	    public static void main(String[] args) {
	       
	    	Library b1 = new Library();
	        b1.setTitle("Java");
	        b1.setAuthor("James Gosling");
	        b1.setIsbn("JA5");
	        b1.setAvailable(false); 

	        Library b2 = new Library();
	        b2.setTitle("Python ");
	        b2.setAuthor("Guido van Rossum");
	        b2.setIsbn("PY0");
	        b2.setAvailable(true);

	        // Display initial status
	        b1.displayInfo();
	        b2.displayInfo();
	        
	      

	}

}
