import java.io.*;

class TestLineNo {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("line.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            int i = 1;
            while ((s = br.readLine()) != null) {
                System.out.println(i + ")" + s);
                i++;
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException o) {
            System.out.println(o.getMessage());
        }
    }
}
