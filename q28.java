import java.util.Arrays;
import java.util.Scanner;
class q28{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    int[] a= new int[n];
    for(int i=0; i<n; i++)
    {
       a[i]= sc.nextInt();
       if(a[i]%2 !=0)
       {
        sum=sum+a[i];
       }
    }
    System.out.println("sum : " +sum);

}
};