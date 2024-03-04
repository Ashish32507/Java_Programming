// package dsa;
import java.util.Scanner;
public class p2 {
    public static void main(String args[])
    {
        Scanner p1 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=p1.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
