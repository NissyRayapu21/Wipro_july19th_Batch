package Lab31;

public class LabArrSecondHigh {

	 public static void main(String[] args) {
	        int[] arr = {10, 50, 20, 40, 30};

	        int largest = arr[0];
	        int secondLargest = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("Second largest number is: " + secondLargest);
	    }
	}


/*public static void main(String[] args) {

int[] numbers = {10, 20, 5, 30, 25};

int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for (int num : numbers) {
 if (num > largest) {
     secondLargest = largest;
     largest = num;
 } else if (num > secondLargest && num != largest) {
     secondLargest = num;
 }
}

if (secondLargest == Integer.MIN_VALUE) {
 System.out.println("There is no second largest number.");
} else {
 System.out.println("Second largest number is: " + secondLargest);
}
}
}*/