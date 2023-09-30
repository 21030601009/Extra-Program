// WAP to find a Factor of a given number using iteration.
import java.util.*;
public class Program3_A
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enyer Number:");
        int num=scan.nextInt();
        System.out.print("Factors:");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+",");
            }
        }
        scan.close();
    }
}
