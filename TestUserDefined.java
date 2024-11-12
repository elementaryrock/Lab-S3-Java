import java.util.Scanner;
class EvenNumberException extends Exception {
    private String message;
    public EvenNumberException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
class OddNumberException extends Exception {
    private String message;
    public OddNumberException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}

class TestUserDefined { 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        try{
            if(a%2==0){
                throw new EvenNumberException("This is an even number");
            }
            else{
                throw new OddNumberException("This is an odd number");
            }
        }
        catch(EvenNumberException e){
            System.out.println(e.getMessage());
        }
        catch(OddNumberException e){
            System.out.println(e.getMessage());
        }
    }
}

