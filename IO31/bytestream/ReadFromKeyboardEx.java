package IO31.bytestream;

import java.util.Scanner;

public class ReadFromKeyboardEx {

	public static void main(String[] args) {
		// creating the scanner class
		
		Scanner scn= new Scanner(System.in);
		//enter 
         System.out.println("Enter the first number:");
         
         int a=scn.nextInt();
         
         System.out.println("Enter the second number:");
         
         int b=scn.nextInt();System.out.println("sum is : "+(a+b));
         
         scn.close();
	}

}
