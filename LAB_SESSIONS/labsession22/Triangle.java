package labsession22;

import java.util.Scanner;


import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for triangle: ");
        int rows = sc.nextInt();

        
        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); 
            }
            System.out.println();
        }

      
    }
}
	