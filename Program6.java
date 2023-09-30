// Pattern

import java.util.*;

public class Program6 
{
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scan.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i==1)
                {
                    continue;
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
