package Lab22july;
import java.util.Scanner;

public class Arraryfind {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		     
		        System.out.print("Enter elements in the array: ");
		        int size = sc.nextInt();

		        
		        int[] array = new int[size];
		        System.out.println("Enter elements of the array:");
		        for(int i = 0; i < size; i++) {
		            array[i] = sc.nextInt();
		        }

		       
		        System.out.print("Enter the element to search : ");
		        int target = sc.nextInt();

		      
		        boolean found = false;
		        for(int i = 0; i < size; i++) {
		            if(array[i] == target) {
		                System.out.println("Element found at index: " + i);
		                found = true;
		                break;
		            }
		        }
		        if(!found) {
		            System.out.println("Element not found in the array.");
		        }

		        sc.close();
		    }
		}
	



