import java.util.Scanner;
class TestVowels {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        int v=0,co=0;
        for (int i=0;i<str.length();i++)
        {
            str.charAt(i);
            if ((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
            {
                v++;
            }
            else
            {
                co++;
            }
        }
        System.out.println("Vowels:"+v+"\nConsonants:"+co);
    }
    
}
