import java.util.Scanner;
class TestMatrix {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows and columns of first matrix");
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int a[][] = new int[10][10];
        System.out.println("Enter elements");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter no of rows and columns of second matrix");
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int b[][] = new int[10][10];
        System.out.println("Enter elements");
        for (int i=0;i<r2;i++)
        {
            for (int j=0;j<c2;j++)
            {
                b[i][j] = s.nextInt();
            }
        }
        int c[][] = new int[10][10];
        if (r1==c2)
        {
            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c2;j++)
                {
                    c[i][j]=0;
                    for (int k=0;k<c1;k++)
                    {
                        c[i][j]=c[i][j]+a[k][j]*b[i][k];
                    }
                }
            }
        }
        System.out.println("The final matrix is");
        for (int i=0;i<r2;i++)
        {
            for (int j=0;j<c1;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
