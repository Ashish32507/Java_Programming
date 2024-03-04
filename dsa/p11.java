import java.util.Scanner;
public class p11{
    public static void main(String args[])
    {
        Scanner ob11 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = ob11.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
             for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
                 System.out.println();
        }


    }
}