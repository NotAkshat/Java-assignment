class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class q52
 {
    public static void main(String[] args) {
        try {
            String country = args[0].toLowerCase();
            String capital = switch (country) {
                case "india" -> "New Delhi";
                case "usa" -> "Washington D.C.";
                default -> throw new NoMatchFoundException("Capital not found for " + country);
            };
            System.out.println("Capital of " + country + ": " + capital);
        } catch (ArrayIndexOutOfBoundsException | NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
