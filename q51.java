public class q51 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10;  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Negative Array Index Exception occurred.");
        }

        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
        }
    }
}
