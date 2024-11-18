class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class q53 {
    public static void main(String[] args) {
        try {
            int num1 = 10, num2 = 0;
            if (num2 == 0) throw new CustomArithmeticException("Cannot divide by zero.");
            System.out.println(num1 / num2);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
