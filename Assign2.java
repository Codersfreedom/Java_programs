class Rectangle{
    int length, breadth;
    Rectangle(int l,int b){  // concept of constructor
        length = l;
        breadth = b;

}
void area(){
    int a = length*breadth;
    System.out.println("Area is: "+a);
}
}

public class Assign2 {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(25,15);
        r1.area();
       
    }
    
}
