import java.util.Scanner;
public class p13 {
    static int DecimTobinNumber(int n)
    {
        int bin=0;
        int num=n;
        int pow =0;
        while(n>0)
        {
            int rem = n%2;
            bin+=rem*(int)Math.pow(10,pow);
            n=n/10;
            pow++;
        }
        return bin;
    }
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter The Any Decimal Number :");
        int n = obj.nextInt();
        System.out.print("Binary Number Of "+n+" Decimal Number Is :"+DecimTobinNumber(n));
    }
}
