import java.util.Scanner;

public class q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String numStr = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < numStr.length() - 1; i++) {
            int n1 = Integer.parseInt(numStr.substring(i, i + 2));
            sum += n1;
        }

        System.out.println("Sum: " + sum);
    }
}
