package lab3.ex2;
import java.util.Arrays;
public class Lab3_Ex2 
 {
	    public static String[] sortStrings(String[] arr) {
	        int n = arr.length;
	        int mid = (n + 1) / 2; 
	        Arrays.sort(arr);

	        for (int i = 0; i < n; i++) {
	            if (i < mid) {
	                arr[i] = arr[i].toUpperCase();
	            } else {
	                arr[i] = arr[i].toLowerCase();
	            }
	        }

	        return arr;
	    }

	    public static void main(String[] args) {
	        String[] inputArray = {"Apple", "Banana", "Grape", "Cherry", "Date"};
	        String[] resultArray = sortStrings(inputArray);

	        System.out.println("Sorted and Modified Array:");
	        for (String s : resultArray) {
	            System.out.println(s);
	        }
	    }
	}


