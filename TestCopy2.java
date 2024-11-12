import java.io.*;
class TestCopy2 {
    public static void main(String args[])
    {
        try{
            FileInputStream fr = new FileInputStream("A.txt");
            FileOutputStream fw = new FileOutputStream("B2.txt");
            int s;
            while((s=fr.read())!=-1)
            {
                fw.write(s);
            }
            fr.close();
            fw.close();
        }
        catch (FileNotFoundException o)
        {
            System.out.println(o.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
