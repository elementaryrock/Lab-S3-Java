import java.util.Scanner;
class TestName {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of Strings");
        int n = s.nextInt();
        s.nextLine();
        System.out.println("Enter String");
        String str[] = new String[5];
        for (int i=0;i<str.length;i++)
        {
            str[i]=s.nextLine();
        }
        for (int i=0;i<str.length;i++)
        {
            for (int j=0;j<str.length-i-1;j++)
            {
                if ((str[j].compareToIgnoreCase(str[j+1]))>0)
                {
                    String t = str[j];
                    str[j] = str[j+1];
                    str[j+1] = t;
                }
            }
        }
        System.out.println("The output is");
        for (int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+"\t");
        }
    }
    
}
