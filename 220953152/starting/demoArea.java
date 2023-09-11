class Shape {
    public double Area() {
        return 0.0;
    }
}

class Triangle extends Shape {
     double base;
     double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double Area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
     double length;
     double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return length * width;
    }
}

class Trapezoid extends Shape {
     double a;
     double b;
     double h;

    public Trapezoid() {
        a = 0;
        b = 0;
        h = 0;
    }
  
     public Trapezoid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
     }

    public double Area() {
        return 0.5 * (a + b) * h;
    }
}

public class demoArea {
    public static void main(String[] args) {
        Triangle shape1 = new Triangle(5.0, 6.0);
        Rectangle shape2 = new Rectangle(4.0, 7.0);
        Trapezoid shape3 = new Trapezoid(3.0, 6.0, 4.0);
        Shape r;
        r= shape1;
        System.out.println("Area of Triangle: " + r.Area());
        r= shape2;
        System.out.println("Area of Triangle: " + r.Area());
        r= shape3;
        System.out.println("Area of Triangle: " + r.Area());
        System.out.println("Area of Triangle: " + shape1.Area());
        System.out.println("Area of Triangle: " + shape2.Area());
        System.out.println("Area of Triangle: " + shape3.Area());
    }
}
