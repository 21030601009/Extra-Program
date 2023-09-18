// WAP to find a sum of even number into 1D array.
import java.util.*;
public class Program1 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);  
        System.out.print("Enter length of array:");
        int n=scan.nextInt();
        int sum=0;
        int[] num=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element of array:");
            num[i]=scan.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            sum=sum+num[j];
        }
        System.out.print("Sum:"+sum);
        }
}