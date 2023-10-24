// WAP to sort an Array using selection sort.

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter array length:");
        int len=scan.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter array Element:");
            int n=scan.nextInt();
            arr[i]=n;
        }
        for(int i=0;i<len-1;i++)
        {
            int min=i;
            for(int j=i+1;j<len;j++)
            {   
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int k=0;k<len;k++)
        {
            System.out.print(arr[k]+",");
        }
        scan.close();
    }
}
