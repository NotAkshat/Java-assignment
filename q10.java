import java.util.Scanner;
class q10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

       int x=0;
       int y=1;
       
       System.out.print(x + " " + y);

       for(int i=2; i<N; i++)
       {
        int z=x+y;
        
        System.out.print(" "+ z);
         x=y;
         y=z;
       }
    }
}