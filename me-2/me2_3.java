import java.util.Scanner;
class methoverload{
    public int sum(int n1,int n2)
    {
        return n1+n2;
    }
    public float sum(float n1,float n2)
    {
        return n1+n2;
    }
}
public class me2_3 {
    public static void main(String args[])
    {
        Scanner su1 = new Scanner(System.in);
        methoverload m = new methoverload();
        System.out.print("Enter The Two Integer value :");
        int n1 = su1.nextInt();
        int n2 = su1.nextInt();
        System.out.print("Enter The Two Decimal value :");
        float m1 = su1.nextFloat();
        float m2 = su1.nextFloat();
        System.out.println("Sum Of Two Integer Number :"+m.sum(n1,n2));
        System.out.println("Sum Of Two Integer Number :"+m.sum(m1,m2));
    }
    
}
