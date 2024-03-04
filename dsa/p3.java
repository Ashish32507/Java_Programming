// package dsa;
import java.util.Scanner;
public class p3 {
    public static void main(String args[])
    {
        Scanner p2 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=p2.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
