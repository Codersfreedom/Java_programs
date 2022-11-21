class Room{
    int length,breadth;
    Room(int l,int b){
        length = l;
        breadth = b;

    }
    void area(){

        int a = length*breadth;
        System.out.println("Area is: "+a);

    }
}

class newRoom extends Room{
    int window;
    newRoom(int l,int b,int w){
        super(l,b);
        window = w;
    }
    void show(){
        System.out.println("No of windows: "+window);

    }
}
public class assign4 {
    public static void main(String args[]) {
        Room r1 = new Room(10, 20);
        r1.area();
        newRoom r2 = new newRoom(30, 14, 5);
        r2.show();

        
    }
}
