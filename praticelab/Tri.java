package praticelab;

import java.util.Scanner;

public class Tri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for triangle: ");
        int rows = scanner.nextInt();

        
        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); 
            }
            System.out.println();
        }

        scanner.close();
    }
}