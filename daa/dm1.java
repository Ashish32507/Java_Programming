// package daa;
import java.util.Scanner;
public class dm1 {
    public static void insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current )
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
        show(arr);
    }
    public static void show(int arr[])
    {
        int x= arr.length;
         for(int i=0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubblesort(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int linearsearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static int binarysearch(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
        int mid,temp;
        bubblesort(arr);
        while(start<=end)
        {
            mid = (start+end)/2;
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
                end = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number Of Element :");
        int x = sc.nextInt();
        int arr[] = new int[x];
        int key,f;
        for(int i=0;i<x;i++)
        {
            System.out.print("Enter The "+i+" Element :");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Entered Elements Are");
        for(int i=0;i<x;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        while(true)
        {
            System.out.println("1.Linear Search");
            System.out.println("2.Binary Search");
            System.out.println("3.Bubble Sort");
            System.out.println("4.Insertion Search");
            System.out.println("5.Exit");
            System.out.print("Enter Your Choices :");
            int choices = sc.nextInt();
            switch(choices)
            {
                case 1:
                    System.out.print("Enter The Element Which You Want To Find :");
                    key = sc.nextInt();
                    f=linearsearch(arr,key);
                    if(f!=-1)
                    {
                        System.out.println(key+" Is Found At :"+f);
                    }
                    else
                    {
                        System.out.println(key+" Is Not Found ");   
                    }
                    break;
                case 2:
                    System.out.print("Enter The Element Which You Want To Find :");
                    key = sc.nextInt();
                    f=binarysearch(arr,key);
                    if(f!=-1)
                    {
                        System.out.println(key+" Is Found At :"+f);
                    }
                    else
                    {
                        System.out.println(key+" Is Not Found ");   
                    }
                    break;
                case 3:
                    bubblesort(arr);
                    for(int i=0;i<arr.length;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
                    break;
                case 4:
                    insertionsort(arr);
                    break;
                case 5:
                    // return;
                    break;
                default:
                    System.out.println("Please Enter The Correct Option");
            }
        }
    }
}
