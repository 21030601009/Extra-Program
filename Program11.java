// WAP to find weather given number is Armstrong number is not.

import java.util.*;
import java.lang.Math;

public class Program11 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();

        int temp=num,rem,ans=0;
        String s=Integer.toString(num);
        int len=s.length();

        while(num>=1)
        {
            rem=num%10;
            ans=(int) (ans+(Math.pow(rem, len)));
            num=num/10;
        }
        if(ans==temp)
        {
            System.out.print(temp+" is Armstrong");
        }
        else
        {
            System.out.print(temp+" is not Armstrong");
        }
    }
}
