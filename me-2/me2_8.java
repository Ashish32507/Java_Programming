public class me2_8 {
    static int staticvariable=20;
    int instancevariable = 50;
    static
    {
        
        staticvariable=60;
        System.out.println("I am Static Block");
        System.out.println("Now Value Of Static Variable "+staticvariable);
    }
    {
        System.out.println("I am Anonumous Block");
        instancevariable=10;
        System.out.println("Now Value Of instance Variable "+instancevariable);
    }
    public static void main(String args[])
    {
        me2_8 s = new me2_8();
    }
}
