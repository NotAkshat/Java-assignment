import java.util.Scanner;
class q21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       
        int i=1;
        int bin=0;
        while(n>0)
        {
          int rem=n%2;
          bin=bin + (rem*i);
          n=n/2;
          i=i*10;
        }
        System.out.println(bin);
    }
};