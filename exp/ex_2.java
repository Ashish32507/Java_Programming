import java.util.Scanner;
class myExp extends Exception{
    public void myfun(int x,int y) throws Exception
    {
        System.out.println("VAlue Of X Is "+x +" Value Of Y Is "+y+"");
        throw new Exception("Exception Throw By Ashish");
    }
}
public class ex_2 {
    public static void main(String arg[]) throws Exception
    {
        Scanner sc2 = new Scanner(System.in);
        try{
            System.out.print("Enter The Number :");
            int s = sc2.nextInt();
            System.out.print("Enter The Number :");
            int y = sc2.nextInt();
            myExp sss = new myExp();
            // sss.myfun(s, y);
            int z = s/y;
             sss.myfun(s, y);

        }
        catch(Exception e){
            System.out.println(e);
            e.getMessage();
        }

    }
}
