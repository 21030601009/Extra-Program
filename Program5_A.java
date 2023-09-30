// WAP to find a summation of a digit of a given number using iteration.

import java.util.*;
public class Program5_A 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        int sum=0,temp;
        while (num>0)
        {
            temp=num%10;
            sum=sum+temp;
            num=num/10;
        }
        System.out.print("Answer="+sum);
        scan.close();
    }
}
