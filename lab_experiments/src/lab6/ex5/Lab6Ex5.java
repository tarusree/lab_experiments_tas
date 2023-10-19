package Lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;

//create a method which accepts an array of integer elements and return the second smallest element in an array . hint : convert to arraylist ,use sort method in collections class

public class Lab6Ex5 {
	public static int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
        	System.out.println("\"Array must contain at least two elements");
        	return 0;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Collections.sort(list);
        return list.get(1);
    }
	
	public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};
        int secondSmallest = getSecondSmallest(arr);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}
