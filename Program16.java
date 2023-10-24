// WAP to sort an Array using Bubble sort.
import java.util.*;

public class Program16 {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Array length:");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter array Element:");
            int n = scan.nextInt();
            arr[i] = n;
        }
        int temp;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int k=0;k<len;k++)
        {
            System.out.print(arr[k]+",");
        }
        scan.close();
    }
}