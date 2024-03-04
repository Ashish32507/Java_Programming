import java.util.*;
public class p10 {
    public static void main(String args[])
    {
        Scanner p9 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=p9.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int space=0;space<n;space++)
            {
                System.out.print(" ");
            }
            for(int r=0;r<n-i;r++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
