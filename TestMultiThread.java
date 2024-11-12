class Even extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
                System.out.println(i);
        }
    }
}
}

class Odd extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
}

class TestMultiThread {
    public static void main(String args[]) {
        try{
            Even e = new Even();
            Odd o = new Odd();
            e.start();
            o.start();
            e.join();
            o.join();
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
