import java.util.*;
public class m3{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Item :");
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter The Number :");
            int x=sc.nextInt();
            if(x%3==0 && x%5==0)
            {
                sum+=x;
                count++;
            }
        }
        System.out.println("Sum :"+sum);
        System.out.println("Average :"+sum/count);
    }
}