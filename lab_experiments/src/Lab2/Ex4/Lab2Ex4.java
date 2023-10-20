package Lab2.Ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex4 {
    public static int[] modifyArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int[] A = Arrays.copyOf(arr, arr.length);

   
        Arrays.sort(A);
        int n = A.length;

        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] != A[i - 1]) {
                uniqueCount++;
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = A[n - 1];
        int j = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (A[i] != A[i + 1]) {
                uniqueArray[j++] = A[i];
            }
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
       
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the length of the array: ");
         int n = scanner.nextInt();

         int[] A = new int[n];
         System.out.println("Enter the elements of the array:");

         for (int i = 0; i < n; i++) {
             A[i] = scanner.nextInt();
         }
         int[] modifiedArray = modifyArray(A);

        System.out.println("Original Array: " + Arrays.toString(A));
        System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
    }
}
