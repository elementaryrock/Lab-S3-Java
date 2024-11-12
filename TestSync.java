import java.util.Scanner;
class Calc {
    private int n;
    public void setValue(int n) {
        this.n = n;
    }
    public synchronized void display() {
        for (int i = 1; i <= n; i++) {
            System.out.println("2"+"*"+i+"="+(2*i));
        }
    }
    public synchronized void display1() {
        for (int i = 1; i <= n; i++) {
            System.out.println("4"+"*"+i+"="+(4*i));
        }
    }
}

class Thread0 extends Thread {
    private Calc c;
    public Thread0(Calc c) {
        this.c = c;
    }
    public void run() {
        c.display();
    }
}

class Thread1 extends Thread {
    private Calc c;
    public Thread1(Calc c) {
        this.c = c;
    }
    public void run() {
        c.display1();
    }
}

class TestSync {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Calc c = new Calc();
        c.setValue(n);
        Thread0 e = new Thread0(c);
        Thread1 o = new Thread1(c);
        e.start();
        o.start();
    }
}