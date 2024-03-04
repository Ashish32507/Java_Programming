import java.util.Scanner;
public class pairArray {
    public static void pair(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner pr = new Scanner(System.in);
        System.out.print("Enter The Number Of Array :");
        int n=pr.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter The Element ");
        for(int i=0;i<n;i++)
        {
            arr[i]=pr.nextInt();
        }
        pair(arr);

    }
}
