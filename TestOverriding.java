class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private int EmpId;

    public void setId(int EmpId) {
        this.EmpId = EmpId;
    }

    public void display() {
        super.display();
        System.out.println("Employee Id: " + EmpId);
    }
}

class TestOverriding {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.setName("Rohan");
        e.setAge(20);
        e.setId(220);
        e.display();
    }
}