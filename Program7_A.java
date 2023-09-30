// WAP to find a Fibonacci series up to n terms using iterative
import java.util.*;

public class Program7_A {
    public static void main(String[] args)
    {
        int t1=0,t2=1,ans=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        for(int i=0;i<=num;i++)
        {
            t1=t2;
            System.out.print(ans+",");
            t2=ans;
            ans=t1+t2;
        }
        scan.close();
    }
}
