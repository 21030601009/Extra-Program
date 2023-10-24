// WAP to sort an Array using insertion sort.
import java.util.Scanner;

public class Program17 {
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
        for(int i=1;i<len;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int k=0;k<len;k++)
        {
            System.out.print(arr[k]+",");
        }
        scan.close();
    }
}
