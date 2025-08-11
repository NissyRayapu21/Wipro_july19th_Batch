package Lab1aug;

import java.util.Scanner;

public class ConsoleRead {

	public static void main(String[] args) {
	    // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // give input
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        // Print the input
        System.out.println("Details of a person : "+name+"-"+age+"years old");

        // Close the scanner
        scanner.close();
    }
}

