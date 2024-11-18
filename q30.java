public class q30 {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
