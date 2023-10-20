package Lab2.Ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
    public static int[] getSorted(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        int length = arr.length;
        int[] A = new int[length];

        for (int i = 0; i < length; i++) {
            A[i] = arr[length - 1 - i];
        }

        return A;
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

        int[] reversedArray = getSorted(A);

        System.out.println("Original Array: " + Arrays.toString(A));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

        scanner.close();
    }
}

