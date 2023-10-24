// WAP to sort an Array using Bucket sort.
import java.util.*;

public class Program19 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Array length:");
        int len=scan.nextInt();

        double[] arr=new double[len];
        double[][] bucket=new double[10][];
        
        // Take element from user
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter Array Element between 0.0 to 1.0:");
            double n=scan.nextDouble();
            arr[i]=n;
        }
        // Add elements in new array
        for(int i=0;i<len;i++)
        {
            double temp=arr[i]*10;
            double ans=Math.floor(temp);
            bucket{$ans}[(int)ans]=arr[i];
        }
        // Print sorted array
        for(int k=0;k<arr2.length;k++)
        {
            if(arr2[k]==0)
            {
                continue;
            }
            else
            {
                System.out.print(arr2[k]+",");
            }
            
        }
        scan.close();
    }
}
