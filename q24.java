import java.util.Scanner;
import java.util.Arrays;
class q24{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int[] a= new int[n];
  int sum=0;
  for(int i=0; i<n; i++)
  {
    a[i] = sc.nextInt();
    sum=sum+a[i];
  }
  System.out.println("sum : "+ sum);

  System.out.println("average : " + sum/2);
  
  

}
};