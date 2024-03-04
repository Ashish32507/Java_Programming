import java.util.Scanner;
public class p14 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = obj.nextInt();
        // for(int i=n;i>=0;i--)
        // {
        //     for(int j=0;j<i;j++)
        //     {
        //         // System.out.print("*");
        //         System.out.print(i*n);
        //     }
        //     System.out.println();
        // }
        int act [] = new int[n];
        int rem=0;
        int j=0;
        while(n>0)
        {
            rem=n%10;
            act[j]=rem;
            j++;
            n=n/10;
        }
        for(int i=0;i<act.length;i++)
        {
            System.out.print(act[i]);
        }
    }
}
