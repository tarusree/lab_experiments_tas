package lab6.ex4;
import java.util.HashMap;
import java.util.Map;

public class Lab6_Ex4 {
	
	
	    public static Map<String, String> getStudents(Map<String, Integer> studentMarks) {
	        
	        Map<String, String> studentMedals = new HashMap<>();

	      
	        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
	            int marks = entry.getValue();
	            String registrationNumber = entry.getKey();
	            String medalType;

	            if (marks >= 90) {
	                medalType = "Gold";
	            } else if (marks >= 80) {
	                medalType = "Silver";
	            } else if (marks >= 70) {
	                medalType = "Bronze";
	            } else {
	                medalType = "No Medal";
	            }

	            studentMedals.put(registrationNumber, medalType);
	        }

	        return studentMedals;
	    }

	    public static void main(String[] args) {
	        Map<String, Integer> studentMarks = new HashMap<>();
	        studentMarks.put("Student1", 92);
	        studentMarks.put("Student2", 85);
	        studentMarks.put("Student3", 78);
	        studentMarks.put("Student4", 60);

	        Map<String, String> result = getStudents(studentMarks);

	        for (Map.Entry<String, String> entry : result.entrySet()) {
	            System.out.println("Registration Number: " + entry.getKey() + ", Medal Type: " + entry.getValue());
	        }
	    }
	}


