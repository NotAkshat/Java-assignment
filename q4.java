import java.util.Scanner;
class q4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(("a is ") + a);
        System.out.println(("b is ") + b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println(("a is ") + a);
        System.out.println(("b is ") + b);

    }
}