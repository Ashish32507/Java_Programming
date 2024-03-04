import java.util.Scanner;
class calculatepower
{
    public double calculateexpo(int value,int expon)
    {
        return Math.pow(value, expon);
    }
}
public class me2_1 {
    public static void main(String agrs[])
    {
        Scanner m21 = new Scanner(System.in);
        calculatepower calculate = new calculatepower();
        System.out.print("Enter The Value of A :");
        int a = m21.nextInt();
        System.out.print("Enter The Value of B :");
        int b = m21.nextInt();
        System.out.println("Exponential Of A power B : "+calculate.calculateexpo(a, b));
    }
}
