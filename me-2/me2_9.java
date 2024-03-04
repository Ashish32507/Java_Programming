interface s1
{
    public void show();
    
}
interface s2
{
    public void show1();
    
}
class demo implements s1,s2
{
    public void show()
    {
        System.out.println("Hello i am from interface s1");
    }
    public void show1()
    {
        System.out.println("Hello i am from interface s2");
    }
    public void output()
    {
        System.out.println("Hello i am from Class demo");
    }

}
public class me2_9 
{
    public static void main(String args[])
    {
        demo d = new demo();
        d.show();
        d.show1();
        d.output();
    }
}
