import java.util.Scanner;
public class p5 {
    public static void main(String args[])
    {
        Scanner p4 = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n=p4.nextInt();
        char ch='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
