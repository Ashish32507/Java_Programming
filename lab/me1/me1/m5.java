import java.util.Scanner;
public class m5 {
    static int binary(int arr[],int key)
    {
       int start = 0;
       int end=arr.length;
       int mid;
       while(start<=end)
       {
            mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                start=mid-1;
            }
            else
            {
                end=mid+1;
            }
            // return 0;
       }
    return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter The "+i+" Element :");
            int y=sc.nextInt();
            arr[i]=y;
        }
        System.out.println("Entered Elements Before Sorting :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Entered Elements After Sorting :");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter The Element Which Yout Want To Find :");
        int key = sc.nextInt();
        int f=binary(arr,key);
        if(f==-1)
        {
            System.out.println("Element Is Not Found ");
        }
        else
        {
            System.out.println("Element Is Found At :"+f);
        }
    

    }
}
