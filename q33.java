import java.util.Scanner;
class q33{
    double sales;

    Commission(double s) {
        sales = s;
    }

    double commission() {
        return sales * 0.10; // 10% commission
    }
}

public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = sc.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The commission is: " + new Commission(sales).commission());
        }
        
    }
}
