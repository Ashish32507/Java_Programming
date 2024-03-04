import java.util.Scanner;
// package dsa;
public class p1 {
    public static void main(String args[])
    {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = p.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
