import java.util.Scanner;
public class p7 {
    public static void main(String args[])
    {
        Scanner p6 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n =p6.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                // System.out.print(j);
                System.out.println(" ");
            }
            System.out.print("*****");
            System.out.println();
        }
    }
}
