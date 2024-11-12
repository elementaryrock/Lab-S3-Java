import java.util.Scanner;

class TestException {
    public static void main(String args[]) {
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = s.nextInt();
            int b = s.nextInt(); 
            int c = a / b;
            }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Division is done");
        }
    }
}