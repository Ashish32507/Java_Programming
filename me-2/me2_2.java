import java.util.Scanner;
class factorial
{
    int f =1;
    factorial(int n)
    {
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println("Factorial Of a N Number is :"+f);
    }
    
}
public class me2_2 {
    public static void main(String args[])
    {
        Scanner me22 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int f = me22.nextInt();
        factorial fi = new factorial(f);
        // System.out.print("Factorial Of Number : "+fi.show());
    }
}
