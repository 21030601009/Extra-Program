// WAP to find whether string is palindrome or not.
import java.util.*;
public class Program2 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter string:");
        char ch;
        String rstr="";
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            rstr=ch+rstr;
        }
        System.out.println(rstr);
        if(rstr.equals(str))
        {
            System.out.print("String is Pallindrom");
        }
        else
        {
            System.out.print("String is Not Pallindrom");
        }
        scan.close();
    }
}
