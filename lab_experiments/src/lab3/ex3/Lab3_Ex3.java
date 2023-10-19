package lab3.ex3;
import java.util.Arrays;
public class Lab3_Ex3 {
	

	    public static int[] getSorted(int[] arr) {
	        int[] reversedArray = reverseArray(arr);
	        Arrays.sort(reversedArray);
	        return reversedArray;
	    }

	    
	    private static int[] reverseArray(int[] arr) {
	        int[] reversedArray = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            reversedArray[i] = arr[arr.length - 1 - i];
	        }
	        return reversedArray;
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {5, 2, 7, 1, 9};
	        int[] sortedReversedArray = getSorted(originalArray);

	        System.out.println("Original Array: " + Arrays.toString(originalArray));
	        System.out.println("Sorted and Reversed Array: " + Arrays.toString(sortedReversedArray));
	    }
	}
