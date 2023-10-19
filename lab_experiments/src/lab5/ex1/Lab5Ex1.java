package lab5.ex1;

// Custom exception class
class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {
    public static void main(String[] args) {
        int age = 14; // Change the age to test different scenarios

        try {
            validateAge(age);
            System.out.println("Age is valid. You can proceed.");
        } catch (AgeValidationException e) {
            System.out.println("Age is not valid: " + e.getMessage());
        }
    }

    // Method to validate age
    static void validateAge(int age) throws AgeValidationException {
        if (age > 15) {
            System.out.println("Age is valid.");
        } else {
            throw new AgeValidationException("Age should be above 15.");
        }
    }
}
