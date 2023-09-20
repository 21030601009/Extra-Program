// WAP to find a Fibonacci series up to n terms using recursion
import java.util.*;
public class Program7_B 
{
    public static int fibonacci(int i)
    {
        if(i==0)
        {
            return 0;
        }
        else if(i==1 || i==2)
        {
            return 1;
        }
        return (fibonacci(i-2)+fibonacci(i-1));
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.print("Enter number:");
        num=scan.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.print(fibonacci(i)+",");
        }
    }
}
