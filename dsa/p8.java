import java.util.*;
public class p8 {
    public static void main(String args[])
    {
        Scanner p7 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n= p7.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
