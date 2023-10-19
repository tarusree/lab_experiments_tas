package lab5.ex2;

	class BlankNameException extends Exception {
	    
		private static final long serialVersionUID = 1L;

		public BlankNameException(String message) {
	        super(message);
	    }
	}


	class Employee {
	    private String firstName;
	    private String lastName;

	    public Employee(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public void validateFullName() throws BlankNameException {
	        if (firstName.isEmpty() || lastName.isEmpty()) {
	            throw new BlankNameException("First name and last name cannot be blank.");
	        }
	        System.out.println("Full name is valid: " + firstName + " " + lastName);
	    }
	}

	public class Lab5_Ex2 {
		
	    public static void main(String[] args) {
	        try {
	           
	            Employee employee = new Employee("Tarusree", "Banik");
	            employee.validateFullName();
	        } catch (BlankNameException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
	}


