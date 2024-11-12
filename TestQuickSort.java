import java.util.Scanner;
class TestQuickSort{
    public static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String args[])
    {
        int low=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int high = n-1;
        System.out.println("Enter elemets of array");
        int arr[] = new int[100];
        for (int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        quicksort(arr,low,high);
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void quicksort(int arr[],int low,int high)
    {
        if (low<high)
        {
            int p = partition(arr,low,high);
            quicksort(arr,low,p-1);
            quicksort(arr,p+1,high);
        }
    }

}