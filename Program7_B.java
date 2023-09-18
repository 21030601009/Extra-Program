// WAP to find a Fibonacci series up to n terms using recursion
import java.util.*;
public class Program7_B {

    public static int fibonacci(int num)
    {
        if(num<=1)
        {
            return num;
        }
        else
        {
            System.out.print(fibonacci(num));
            num=num+1;
            return (fibonacci(num-1)+fibonacci(num-2));
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        // for(int i=0;i<=num;i++)
        // {
        //     int ans=fibonacci(num);
        //     System.out.print(ans);
        // }
    }
}
