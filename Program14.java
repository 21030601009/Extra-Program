// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).
import java.util.*;
public class Program14
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        int degree;
        System.out.print("Enter hour(0-12):");
        int hour=scan.nextInt();

        System.out.print("Enter minute(0-60):");
        int minute=scan.nextInt();

        if((hour>=0)&&(hour<=12)&&(minute>=0)&&(minute<=60))
        {
            
        }
        else
        {
            System.out.print("Enter Valid data");
        }
    }
}
