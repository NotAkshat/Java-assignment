class InvalidUsernamePasswordException extends Exception {
    public InvalidUsernamePasswordException(String message) {
        super(message);
    }
}

public class UserLogin {
    public static void main(String[] args) {
        try {
            String username = args[0];
            String password = args[1];
            if (username.length() < 6 || !password.equals("password123"))
                throw new InvalidUsernamePasswordException("Invalid username or password.");
            System.out.println("Login successful.");
        } catch (InvalidUsernamePasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
