import java.util.Scanner;
public class p12 {
    public static void main(String args[])
    {
        Scanner obj12 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = obj12.nextInt();
        for(int row=0;row<n;row++)
        {
            for(int star=0;star<row;star++)
            {
                System.out.print("*");
            }
            for(int space =2*n-row;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int starr=0;starr<row;starr++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
