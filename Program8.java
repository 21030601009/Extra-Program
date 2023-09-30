// WAP to find a total odd and total even digit of a given number.
import java.util.*;
public class Program8 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int rem,even=0,odd=0;
        System.out.print("Enter number:");
        int num=scan.nextInt();
        while (num>=1)
        {
            rem=num%10;
            if(rem%2==0)
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
            num=num/10;
        }
        System.out.println("Odd="+odd);
        System.out.println("Even="+even);
        scan.close();
    }
}
