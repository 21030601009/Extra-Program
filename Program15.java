// WAP to convert a Decimal number to BCD.
import java.util.*;
public class Program15 
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int rem;
        ArrayList<String> ans = new ArrayList<String>();
        System.out.print("Enter Decimal number:");
        int decimal=scan.nextInt();
        while(decimal>=0)
        {
            rem=decimal%10;
            System.out.print(rem);
            if(rem==0)
            {
                ans.add("0000");
            }
            else if(rem==1)
            {
                ans.add("0001");
            }
            else if(rem==2)
            {
                ans.add("0010");
            }
            else if(rem==3)
            {
                ans.add("0011");
            }
            else if(rem==4)
            {
                ans.add("0100");
            }
            else if(rem==5)
            {
                ans.add("0101");
            }
             else if(rem==6)
            {
                ans.add("0110");
            }
             else if(rem==7)
            {
                ans.add("0111");
            }
             else if(rem==8)
            {
                ans.add("1000");
            }
             else if(rem==9)
            {
                ans.add("1001");
            }
            decimal=decimal/10;
        }
        scan.close();
    System.out.print(ans);
    //     for (String i : ans) {
    //         System.out.print(i);
    // }
    }
}
