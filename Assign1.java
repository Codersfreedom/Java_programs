class Rectangle{
    int length,breadth;
    void getdata(int l,int b){
        length = l;
        breadth = b;
    }
    void area(){
        int a = length*breadth;
        System.out.println("Area is: "+a);
    }
}
class Assign1 {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.getdata(20,14);
        r1.area();
        
    }
    
}
