import java.io.*;
class TestStringSum
{
    public static void main(String args[])
    {
        try{
            FileReader fr = new FileReader("int.txt");
            BufferedReader br = new BufferedReader(fr);
            String s[] = br.readLine().split("\\s+");
            Integer sum=0;
            for(int i=0;i<s.length;i++)
            {
                sum = sum + Integer.parseInt(s[i]);
            }
            /* OR
            for (String e:s)
            {
                sum = sum + Integer.parseInt(e);
            } */
            System.out.println(sum);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException o)
        {
            System.out.println(o.getMessage());
        }
    }
}