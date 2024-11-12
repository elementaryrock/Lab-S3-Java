class Maths
{
    public synchronized void display1()
    {
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"is even");
            }
        }
    }
    public synchronized void display2()
    {
        for(int i=0;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+"is odd");
            }
        }
    }
}

class Thread0 extends Thread
{
  private Maths m;
  public Thread0(Maths m)
  {
    this.m=m;

  }
  public void run()
  {
    m.display1();
  }
}

class Thread1 extends Thread
{
  private Maths m;
  public Thread1(Maths m)
  {
    this.m=m;

  }
  public void run()
  {
    m.display2();
  }
}

class Thread2 
{
public static void main(String args[])
{
    Maths m=new Maths();
Thread0 e=new Thread0(m);
Thread1 o=new Thread1(m);


    e.start();
    o.start();
}
}