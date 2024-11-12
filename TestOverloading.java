class Overload {
    public void area(int r) {
        System.out.println("Area of Circle is " + (3.14 * r * r));
    }

    public void area(double s) {
        System.out.println("Area of Square is " + (s * s));
    }

    public void area(int a, int b) {
        System.out.println("Area of Rectangle is " + (a * b));
    }
}

class TestOverloading {
    public static void main(String args[]) {
        Overload o = new Overload();
        o.area(5);
        o.area(5.5);
        o.area(3, 4);
    }
}
