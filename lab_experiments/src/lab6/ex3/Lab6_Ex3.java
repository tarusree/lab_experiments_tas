package lab6.ex3;


	import java.util.HashMap;
	import java.util.Map;

	public class Lab6_Ex3 {
	    public static Map<Integer, Integer> getSquares(int[] numbers) {
	      
	        Map<Integer, Integer> squareMap = new HashMap<>();
	        for (int number : numbers) {
	            int square = number * number;
	            squareMap.put(number, square);
	        }

	        return squareMap;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        Map<Integer, Integer> result = getSquares(numbers);

	        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}


