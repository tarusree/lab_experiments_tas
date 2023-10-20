package Lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex2 {
    public static String[] sortStrings(String[] arr) {

        if (arr == null || arr.length == 0) {
            return new String[0];
        }

        Arrays.sort(arr);

        int mid = arr.length / 2;

     
        for (int i = 0; i < mid; i++) {
            arr[i] = arr[i].toUpperCase();
        }

       
        for (int i = mid; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] inputArray = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextLine();
        }

        scanner.close();

        String[] resultArray = sortStrings(inputArray);

        System.out.println("Sorted and Transformed Array:");
        for (String element : resultArray) {
            System.out.println(element);
        }
    }
}


//    public static void main(String[] args) {
////        String[] inputArray = { "apple", "Banana", "cherry", "Date" };
//    	Scanner scanner = new Scanner(System.in);
//        }
//    }
//}

