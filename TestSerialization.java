import java.io.*;
class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println(name+age);
    }
}

class TestSerialization
{
    public static void main(String args[])
    {
        try{
            Person p = new Person("Hermonie",19);
            FileOutputStream f = new FileOutputStream("Person1.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(p);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}