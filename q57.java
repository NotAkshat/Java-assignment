class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonAgeCheck {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        try {
            if (age < 0) throw new NegativeAgeException("Age cannot be negative.");
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
