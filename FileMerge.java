import java.io.*;
class FileMerge {
    public static void main(String args[])
    {
        try
        {
            FileReader fr1 = new FileReader("A.txt");
            FileReader fr2 = new FileReader("B.txt");
            BufferedReader b1 = new BufferedReader(fr1);
            BufferedReader b2 = new BufferedReader(fr2);
            FileWriter fw = new FileWriter("C.txt");
            String s;
            while((s=b1.readLine())!=null)
            {
                fw.write(s);
            }
            while((s=b2.readLine())!=null)
            {
                fw.write(s);
            }
            fr1.close();
            fr2.close();
            fw.close();
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
