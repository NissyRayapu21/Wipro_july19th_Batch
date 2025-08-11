package Lab2_08;

import java.util.Arrays;

public class SortIntArrMulTh {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.parallelSort(arr);
        
        // Sorts the array using multiple threads

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

