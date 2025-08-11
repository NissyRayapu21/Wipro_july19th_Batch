package Lab31july;

public class LabNums {

	 public static void main(String[] args) {
	        printNum(1);
	    }

	    public static void printNum(int num) {
	        if (num <= 100) {
	            System.out.println(num);
	            printNum(num + 1); // recursive (calls itself)
	        }
	    }
	}