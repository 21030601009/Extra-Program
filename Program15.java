// WAP to convert a Decimal number to BCD.
import java.util.*;
public class Program15 
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int rem,reverse=0;
        String ans="";
        System.out.print("Enter Decimal number:");
        int num=scan.nextInt();
        while(num>0)
        {
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        while(reverse>0)
        {
            rem=reverse%10;
            if(rem==0)
            {
                ans+="0000";
            }
            else if(rem==1)
            {
                ans+="0001";
            }
            else if(rem==2)
            {
                ans+="0010";
            }
            else if(rem==3)
            {
                ans+="0011";
            }
            else if(rem==4)
            {
                ans+="0100";
            }
            else if(rem==5)
            {
                ans+="0101";
            }
             else if(rem==6)
            {
                ans+="0110";
            }
             else if(rem==7)
            {
                ans+="0111";
            }
             else if(rem==8)
            {
                ans+="1000";
            }
             else if(rem==9)
            {
                ans+="1001";
            }
            reverse=reverse/10;
        }
        scan.close();
    System.out.print("BCD:"+ans);
    }
}
