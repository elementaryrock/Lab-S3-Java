// import java.io.*;
// class TestStringFreq {
//     public static void main(String args[])
//     {
//         try{
//         InputStreamReader isr = new InputStreamReader(System.in);
//         BufferedReader br = new BufferedReader(isr);
//         System.out.println("Enter String");
//         String str = br.readLine();
//         System.out.println("Enter character to search for");
//         char c = (char)br.read();
//         int count=0;
//         for (int i=0;i<str.length();i++)
//         {
//             if (c==str.charAt(i))
//             {
//                 count++;
//             }
//         }
//         System.out.println("count is"+count);
//     }
//     catch(IOException e)
//     {
//         System.out.println(e.getmessage());
//     }
//     }
// }

import java.util.Scanner;
class TestStringFreq {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        System.out.println("Enter character to search for");
        char c = s.nextLine().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            if (c==str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("count is"+count);
    }
    
}

