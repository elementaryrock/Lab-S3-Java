import java.io.*;
class TestCopy {
    public static void main(String args[])
    {
        try{
            FileReader fr = new FileReader("A.txt");
            FileWriter fw = new FileWriter("B.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null)
            {
                fw.write(s);
            }
            fr.close();
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
