class A
{
    public void show()
    {
        System.out.println("Hello I am From Class A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("Hello I am From Class B");
    }
}
public class me2_6 {
    public static void main(String args[])
    {
        B b =new B();
        A a = new A();
        a.show();
        b.show();
    }
}
