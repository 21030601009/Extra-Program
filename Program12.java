// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value should be taken from user
import java.util.*;
public class Program12
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int min=-0,max=-0,num;
        double sum=0;
        System.out.print("Enter how many number you can enter:");
        int len=scan.nextInt();
        if(len<=0)
        {
            System.out.print("Invalid input");
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                System.out.print("Enter number:");
                num=scan.nextInt();
                if(i==0)
                {
                    min=num;
                    max=num;
                }
                if(num>max)
                {
                    max=num;
                }
                if(num<min)
                {
                    min=num;
                }
                sum += num;
            }
        }
        System.out.println("Min="+min);
        System.out.println("Max="+max);        
        System.out.println("Sum="+sum);

        System.out.print("Average="+sum/len);
        scan.close();
    }
}