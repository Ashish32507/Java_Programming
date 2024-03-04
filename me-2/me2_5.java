import java.util.Scanner;
class recsum{
    public int sum(int n)
    {
        int total=0;
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n+sum(n-1);
        }
            
    }
}
public class me2_5 {
    public static void main(String args[])
    {
        Scanner res = new Scanner(System.in);
        recsum f = new recsum();
        System.out.print("Enter The Number :");
        int n=res.nextInt();
        System.out.print("Sum Of N Number : "+f.sum(n));
    }
    
}
