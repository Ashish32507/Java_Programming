import java.util.Scanner;
public class p6 {
    public static void main(String args[])
    {
        Scanner p5 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n= p5.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==0 ||i==n-1)
            {
                for(int d=0;d<n;d++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=0;j<n;j++)
                {
                    if(j==0 ||j==n-1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
