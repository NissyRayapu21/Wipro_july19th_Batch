package labsession22;
import java.util.Scanner;

public class Arr {

	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter elements in the array: ");
	        int k = sc.nextInt();

	       
	     
	        int[] array = new int[k];
	        System.out.println("Enter elements of the array:");
	        for(int i = 0; i < k; i++) {
	            array[i] = sc.nextInt();
	        }

	        
	        int start = 0;
	        int end = k - 1;
	        while(start < end) {
	           
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;

	            start++;
	            end--;
	        }

	       
	        System.out.println("Reversed array:");
	        for(int i = 0; i < k; i++) {
	            System.out.print(array[i] + " ");
	        }

	        sc.close();
	    }
	}
