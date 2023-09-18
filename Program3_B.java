// WAP to find a Factor of a given number using recursion.
import java.util.*;
public class Program3_B 
{
    static int temp=1,num;
    public static int isPallindrom(int num,int temp)
    {
        if(temp<=num)
        {
            if(num%temp==0)
            {
                System.out.print(temp+",");
            }
            temp=temp+1;
            return isPallindrom(num,temp);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        isPallindrom(num,temp);
    }
}
