import java.util.Scanner;
import java.lang.Math;
class q16_q17{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1= sc.nextInt();
      int n2= sc.nextInt();

      int mini=Math.min(n1,n2);
      int h=0;
      for(int i=1; i<=mini; i++)
      {
          if(n1%i==0 && n2%i==0)
          {
            h=i;
          }
      }
      System.out.println("hcf"+" "+h);
      System.out.println("lcm"+" "+(n1*n2)/h);

  }
};