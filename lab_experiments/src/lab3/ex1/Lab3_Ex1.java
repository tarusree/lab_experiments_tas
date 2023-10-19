package lab3.ex1;
import java.util.StringTokenizer;
public class Lab3_Ex1 {
	


	    public static void main(String[] args) {
	     
	        String inputLine = "10 20 30 40 50";
	        StringTokenizer tokenizer = new StringTokenizer(inputLine);

	        int sum = 0;

	        while (tokenizer.hasMoreTokens()) {
	            String token = tokenizer.nextToken();
	            
	                int number = Integer.parseInt(token);
	                System.out.println("Integer: " + number);
	                sum += number;
	           
	              
	            }
	        

	       
	        System.out.println("Sum of Integers: " + sum);
	    }
}
	


