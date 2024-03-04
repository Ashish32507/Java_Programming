import java.util.*;
// import java.lang.*;
public class m2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println(Math.sqrt(n));
        }
        else if(n<0)
        {
            // int y = (int);
            int y=n*-1;
            System.out.println((int)Math.sqrt(y)+"i");
        }
    }
}