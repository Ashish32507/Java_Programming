import java.util.*;
public class binomial {
    public static int factorial(int n)
    {
        int fact =1;
        for(int i=1;i<=n;i++ )
        {
            fact*=i;
        }
        return fact;
    }
    public static void solution()
    {
        Scanner bi = new Scanner(System.in);
        System.out.print("Enter The value Of N :");
        int n = bi.nextInt();
        System.out.print("Enter The value Of R :");
        int r = bi.nextInt();
        int fact =factorial(n);
        int rfact=factorial(r);
        int nrfact=factorial(n-r);
        System.out.println("Binomial Is :"+fact/(rfact*nrfact));
    }
    public static void main(String args[])
    {
        solution();
      
    }
}
