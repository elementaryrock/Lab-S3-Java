import java.io.*;
class TestReader {
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader("A.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null)
            {
                System.out.print(s);    
            }
            fr.close();
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
