import java.util.Scanner;
class greatest{
    public int greater(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public int greater(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public int greater(int a,int b,int c,int d)
    {
        if(a>b && a>b && a>d)
        {
            return a;
        }
        else if(b>a && b>c && b>d)
        {
            return b;
        }
        else if(c>a && c>b && c>d)
        {
            return c;
        }
        else
        {
            return d;
        }
    }
}
public class me2_4 {
    public static void main(String args[])
    {
        try (Scanner su2 = new Scanner(System.in)) {
            greatest g = new greatest();
            System.out.print("Enter The 1st Number :");
            int a = su2.nextInt();
            System.out.print("Enter The 2nd Number :");
            int b = su2.nextInt();
            System.out.print("Enter The 3rd Number :");
            int c = su2.nextInt();
            System.out.print("Enter The 4th Number :");
            int d = su2.nextInt();
            System.out.println("Greatest Of Two A and B : "+g.greater(a,b));
            System.out.println("Greatest Of Three A and B And C : "+g.greater(a,b,c));
            System.out.println("Greatest Of Four A and B And C And D: "+g.greater(a,b,c,d));
        }
    }
}
