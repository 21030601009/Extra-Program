// WAP to find a Multiplication of 2 Matrix
import java.util.*;
public class Program13 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter matrix size:");
        int size=scan.nextInt();
        int[][] matrix1=new int[size][size];
        int[][] matrix2=new int[size][size];
        int[][] ans=new int[size][size];
        
        // Take a element of matrix from user
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("Enter First Matrix Element:");
                matrix1[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("Enter second Matrix Element:");
                matrix2[i][j]=scan.nextInt();
            }
        }

        // Matrix Multiplication
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                ans[i][j]=0;
                for(int k=0;k<size;k++)
                {
                    ans[i][j]=ans[i][j]+(matrix1[i][k]*matrix2[k][j]);
                }
                
            }
        }
        
        // Final Answer
        for(int i=0;i<size;i++)
        {
            System.out.print('[');
            for(int j=0;j<size;j++)
            {
                System.out.print(ans[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
        scan.close();
    }
}
