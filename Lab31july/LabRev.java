package Lab31july;

public class LabRev {
	public static void main(String[] args) {

	   int n = 12345;  
	    int rev = 0;

	    while (n > 0) {
	        int digit = n % 10;        // Get last digit
	        rev = rev* 10 + digit; // stores in rev
	        n = n/ 10;           // remove last num, remaining num
	    }

	    System.out.println("Reversed number: " + rev);
	}
	}

 /*public static void main(String[] args) {
     String str = "xxyyzzzsd";
     
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         boolean isUnique = true;

         for (int j = 0; j < str.length(); j++) {
             if (i != j && ch == str.charAt(j)) {
             	isUnique = false;
                
             }
         }

         if (isUnique) {
             System.out.println("First non-repeating character is: " + ch);
             return;
         }
     }

    
 }
}*/