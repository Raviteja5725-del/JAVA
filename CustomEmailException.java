class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}

public class CustomEmailException {
    static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@"))
            throw new InvalidEmailException("Invalid email: '@' missing");
        else
            System.out.println("Valid email");
    }

    public static void main(String[] args) {
        try {
            validateEmail("userexample.com");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
