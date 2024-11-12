import java.util.Scanner;
class TestStringQuickSort {
    public static void main(String args[])
    {
        int low=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        s.nextLine();
        int high=n-1;
        String str[] = new String[100];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
        {
            str[i]=s.nextLine();
        }
        quicksort(str,low,high);
        for (int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
    public static void quicksort(String str[],int low,int high)
    {
        if(low<high)
        {
            int p=partition(str,low,high);
            quicksort(str,low,p-1);
            quicksort(str,p+1,high);
        }
    }
    public static int partition(String str[],int low,int high)
    {
        String pivot=str[high];
        int i=low-1;
        for (int j=low;j<high;j++)
        {
            if((str[j].compareToIgnoreCase(pivot))<0)
            {
                i++;
                String temp= str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
        String temp= str[i+1];
        str[i+1] = str[high];
        str[high] = temp;
        return i+1;
    }

}
