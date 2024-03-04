import java.util.Scanner;
public class p4 {
    public static void main(String args[])
    {
        Scanner p3 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=p3.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
