abstract class Shape {
    public void numberofSides() {}
}

class Rectangle extends Shape {
    public void numberofSides(int a) {
        System.out.println("Number of sides of rectangle is " + a);
    }
}
class Triangle extends Shape{
    public void numberofSides(int a) {
        System.out.println("Number of sides of triangle is " + a);
    }
}
class Hexagon extends Shape{
    public void numberofSides(int a) {
        System.out.println("Number of sides of hexagon is " + a);
    }
}

class TestAbstract {
    public static void main(String args[]){
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        r.numberofSides(4);
        t.numberofSides(3);
        h.numberofSides(6);
    }
}