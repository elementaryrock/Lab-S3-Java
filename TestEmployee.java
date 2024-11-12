class Employee {
    private String name;
    private int age;
    private String address;
    private int Salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int name) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return Salary;
    }

    public void printSalary() {
        System.out.print( Salary);
    }
}

class Officer extends Employee {
    private String Specialization;

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public String getSpecialization() {
        return Specialization;
    }

}

class Manager extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

class TestEmployee {
    public static void main(String args[]) {
        Employee e = new Employee();
        Officer o = new Officer();
        Manager m = new Manager();
        o.setName("John");
        o.setAge(25);
        o.setAddress("Bangalore");
        o.setSalary(100000);
        o.setSpecialization("Java");
        System.out.println("Officer");
        System.out.println("Name : " + o.getName());
        System.out.println("Age : " + o.getAge());
        System.out.println("Address : " + o.getAddress());
        System.out.println("Salary : " + o.getSalary());
        System.out.println("Officer Salary is ");
        o.printSalary();
        System.out.println("Specialization : " + o.getSpecialization());
        m.setName("Raj");
        m.setAge(30);
        m.setAddress("Bangalore");
        m.setSalary(200000);
        m.setDepartment("IT");
        System.out.println("\nManager");
        System.out.println("Name : " + m.getName());
        System.out.println("Age : " + m.getAge());
        System.out.println("Address : " + m.getAddress());
        System.out.println("Salary : " + m.getSalary());
        System.out.println("Manager Salary is ");
        m.printSalary();
        System.out.println("Department : " + m.getDepartment());
    }
}