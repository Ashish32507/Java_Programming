import java.util.Scanner;
public class m4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = sc.nextInt();
        int flag=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag++;
            }
        }
        if(flag==0)
        {
            System.out.println("Given Number Is Prime ");
        }
        else
        {
            System.out.println("Given Number Is Not Prime ");
        }
    }
}
