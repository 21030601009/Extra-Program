// WAP to find whether a number is Odd or Even without using a % operator.
import java.util.*;
public class Program9 {
    public static boolean check(int num)
    {
        return((num/2)*2==num);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        if(check(num)==true)
        {
            System.out.print("Number is Even");
        }
        else
        {
            System.out.print("Number is Odd");
        }
    }
}
