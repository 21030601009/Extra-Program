// WAP to find a factorial of a given integer using recursion.
import java.util.*;
public class Program4_B 
{
    public static int sum=1,temp=1;

    public static int isFactorial(int temp,int sum)
    {
        if(temp<=sum)
        {
            sum*=temp;
            temp=temp+1;
            return(isFactorial(temp,sum));
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        int ans=isFactorial(temp,sum);
        System.out.print("Factorial of"+num+"="+ans);
    }
}
