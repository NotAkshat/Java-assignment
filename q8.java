import java.util.Scanner;
class q8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a%b==0)
        System.out.println("Divisible");

        else
        System.out.println("Not Divisible");

    }
}