import java.util.Scanner;

class q19{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();

    int temp=n;
    int rev=0;
    while(n>0)
    {
        rev=rev*10 + n%10;
        n=n/10;
    }

    if(rev==temp)
    {
        System.out.println("True");
    }
    else{
        System.out.println("Not True");
    }
}
};