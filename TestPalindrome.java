import java.util.Scanner;

class TestPalindrome{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        int i=0,j=str.length()-1;
        for (i=0;i<str.length();i++)
        {
            if (str.charAt(i)!=str.charAt(j))
            {
                System.out.println("Not a palindrome string");
                break;
            }
            else
                j--;
        }
        if (i>j)
        {
            System.out.println("Palindrome String");
        }
    }
}