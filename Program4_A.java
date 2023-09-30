// WAP to find a factorial of a given integer using iteration.
import java.util.*;

public class Program4_A 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int ans=1;
        System.out.print("Enter Number:");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++)
        {
            ans=ans*i;
        }
        System.out.print("Factorial of "+num+"="+ans);
        scan.close();
    }
}
