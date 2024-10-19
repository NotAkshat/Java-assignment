import java.util.Scanner;
class q6{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();

        if(y%4==0)
        System.out.println("Leap Year");

        else
        System.out.println("Not a leap year");
    }
}