package lab3.ex4;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Lab3_Ex4 {

	    public static int[] modifyArray(int[] arr) {
	        
	        Set<Integer> uniqueSet = new HashSet<>();

	        for (int num : arr) {
	            uniqueSet.add(num); 
	        }
	        int[] uniqueArray = new int[uniqueSet.size()];
	        int index = 0;
	        for (int num : uniqueSet) { 
	            uniqueArray[index] = num;
	            index++;
	        }
	        Arrays.sort(uniqueArray);
	        reverseArray(uniqueArray);

	        return uniqueArray;
	    }
	    
	    private static void reverseArray(int[] arr) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {5, 2, 7, 2, 5, 8, 7};
	        int[] modifiedArray = modifyArray(originalArray);

	        System.out.println("Original Array: " + Arrays.toString(originalArray));
	        System.out.println("Modified Array (Descending Order with Duplicates Removed): " + Arrays.toString(modifiedArray));
	    }
	}


