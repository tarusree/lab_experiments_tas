package lab6.ex2;


	import java.util.HashMap;
	import java.util.Map;

	public class Lab6_Ex2 {
	    public static Map<Character, Integer> countChars(char[] arr) {
	     
	        Map<Character, Integer> charCountMap = new HashMap<>();

	       
	        for (char c : arr) {
	        
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	             
	                charCountMap.put(c, 1);
	            }
	        }

	        return charCountMap;
	    }

	    public static void main(String[] args) {
	        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a'};
	        Map<Character, Integer> result = countChars(arr);

	        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}


