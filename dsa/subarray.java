import java.util.Scanner;
public class subarray {
    public static void subArray(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int start = i;
            for(int j=i+1;j<arr.length;j++)
            {
                int end=j;
                for(int k=start;k<end;k++)
                {
                    // System.out.print(arr[k] +" ");
                    sum+=arr[k];
                }
                System.out.println(sum);
                System.out.println();
                sum=0;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        subArray(arr);
    }
}
