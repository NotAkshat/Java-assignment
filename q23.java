import java.util.Scanner;
class q23{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int z=1;
      for(int i=0; i<n; i++)
      {
        for(int j=1; j<=(2*i + 1); j++)
        {
            System.out.print(z + " ");
            z++;
        }
        System.out.println();
      } 

      for(int i=1; i<n; i++)
      {
        for(int j=(n-i); j>0; j--)
        {
            System.out.print("  ");
        }
        for(int k=i; k>0; k--)
        {
            System.out.print(k + " ");
        }
        for(int j=2; j<=i; j++)
        {
            System.out.print(j + " ");
        }
        System.out.println();
      } 
      
    }
};