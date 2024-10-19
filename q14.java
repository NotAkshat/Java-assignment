import java.util.Scanner;
class q14{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();

    int l=n/10;
    for(int i=1; i<=l; i++)
    {
        System.out.print(10*i+ " ");
    }
}
};