// WAP to find a summation of a digit of a given number using recursion.
import java.util.*;

public class Program5_B 
{

    public static int temp,sum=0;

    public static int summation(int num,int sum)
    {
        if(num>0)
        {
            temp=num%10;
            sum=sum+temp;
            num=num/10;
            return summation(num, sum);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        int ans=summation(num, sum);
        System.out.print("Answer="+ans);
        scan.close();
    }
}
