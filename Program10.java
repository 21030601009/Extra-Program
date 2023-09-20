// WAP to find a prime number between range.
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int num1=scan.nextInt();
         System.out.print("Enter Second Number:");
        int num2=scan.nextInt();
        for(int i=num1;i<=num2;i++)
        {
            int temp=2,flag=0;
            while(temp<i)
            {
                if(i%temp==0)
                {
                    flag=1;
                    break;
                }
                temp=temp+1;
            }
            if(flag==0)
            {
                System.out.print(i+",");
            }
        }
    }
}
