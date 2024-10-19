import java.util.Scanner;
class q12{

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int m= sc.nextInt();
    int p= sc.nextInt();
    int c= sc.nextInt();

    if(m+p+c >= 200 || m+p>=150)
    {
        System.out.println("Eligible");
    }
    else
    {
        System.out.println("Not Eligible");
    }
}
};