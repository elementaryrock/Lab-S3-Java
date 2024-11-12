class TestPriority {
    public static void main(String args[])
    {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        System.out.println(t1.getPriority());
        t2.setPriority(3);
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println("Current thread is :");
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        
    }
}
