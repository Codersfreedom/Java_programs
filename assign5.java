class Room {
    int length, breadth;

    Room(int l, int b) {
        length = l;
        breadth = b;

    }

    void show() {
        int a = length * breadth;
        System.out.println("Area is: " + a);

    }
}

class newRoom extends Room {
    int window;

    newRoom(int l, int b, int w) {
        super(l, b);
        window = w;
    }
    @Override
    void show() {
        int a = length * breadth;
        System.out.println("Area is: " + a);
        System.out.println("No of window is: " + window);
    }
}

public class assign5 {
    public static void main(String[] args) {
        Room r1 = new Room(12, 40);
        r1.show();
        newRoom r2 = new newRoom(15, 45, 8);
        r2.show();

    }
}
