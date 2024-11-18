class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class q37 {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        
        System.out.println("Sum of integers: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(5.5, 10.5));
        System.out.println("Concatenation of strings: " + math.add("Hello, ", "World!"));
    }
}
