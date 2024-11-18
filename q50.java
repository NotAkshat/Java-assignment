public class q50 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 30;  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
