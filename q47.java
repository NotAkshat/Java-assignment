class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class q47 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.displayCount();
    }
}