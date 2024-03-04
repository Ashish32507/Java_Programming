// package exp;
import java.util.Scanner;
import java.lang.*;
public class ex_1 {
    public static void main(String args[])
    {
        try{
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter The Number 1st :");
            int x = sc1.nextInt();
            System.out.print("Enter The Number 2nd :");
            int y = sc1.nextInt();
            int z = x/y;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }


    }
}
