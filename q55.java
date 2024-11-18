class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class q55 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        try {
            if (age > 45) throw new TooOlder("Too old for recruitment.");
            if (age < 20) throw new TooYounger("Too young for recruitment.");
            System.out.println("Eligible: " + args[0]);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }
}
