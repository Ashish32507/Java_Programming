import java.util.Scanner;
public class p9 {
    public static void main(String args[])
    {
        Scanner p8 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=p8.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int l=0;l<n-i+1;l++)
            {
                System.out.print(" ");
            }
            if(i==0||i==n-1)
            {
                for(int k=0;k<n;k++)
                {
                    System.out.print("*");
                }
            }
            else
            {
              System.out.print("*");
              for(int j=0;j<n-2;j++)
              {
                System.out.print(" ");
              }
              System.out.print("*");
            }
            System.out.println();
        }

    }
}
