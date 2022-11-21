interface Variables {
    float pi = 3.14f;

}

interface Methods {
    void area();
}

class Rectangle implements Methods {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;

    }

    public void area() {
        System.out.println("\nArea of the Rectangle is: " + length * breadth);
    }

}

class Circle implements Variables, Methods {
    float radius;

    Circle(float r) {
        radius = r;
    }

    public void area() {
        System.out.println("\nArea of the circle is: " + pi * radius * radius);
    }
}

public class Ass6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20, 10);
        r1.area();
        Circle c1 = new Circle(5);
        c1.area();
    }
}
