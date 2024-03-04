import java.util.Scanner;
public class m1
{
  public static void main(String agrs[])
{
   
    Scanner s = new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter The first Number :");
    a=s.nextInt();
    System.out.println("Enter The Second Number :");
    b=s.nextInt();
    System.out.println("Enter The Third Number :");
    c=s.nextInt();
    while (true)
    {
          System.out.println("1. Greatest Number Without Using If Statement ");
          System.out.println("2. Greatest Number Using If Statement ");
          System.out.println("3. Exit");
          System.out.print("Enter Your Choices : ");
          int x = s.nextInt();
          switch(x)
          {
            case 1:
                  int y = (a>b?(a>c?a:c):(b>c?b:c));
                  System.out.println(y+" Is Greater ");
                  break;
            case 2:
                  if(a>b && a>c)
                  {
                    System.out.println(a+" Is Greater ");
                  }
                  else if(b>a && b>c)
                  {
                    System.out.println(b+" Is Greater ");
                  }
                  else
                  {
                    System.out.println(c+" Is Greater ");
                  }
                  break;
            case 3:  
                return;  
          }
        } 
          
      
}
}