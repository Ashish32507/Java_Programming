import java.util.Scanner;
class aaa{
    public void sss(int... number)
    {
        for(int n :number)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }

}
public class me2_7 {
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        aaa a1 = new aaa();
       a1.sss(10,20,30,40);
    }
}
