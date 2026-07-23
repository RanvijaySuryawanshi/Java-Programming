class Cube{
    int length, breadth, height;
    Cube(){
        length = 4;
        breadth = 4;
        height = 4;
    }
    Cube(int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    Cube(Cube c){
        length = c.length;
        breadth = c.breadth;
        height = c.height;
    }
    void volume(){
        System.out.println("Volume = " + (length * breadth * height));
    }
    public static void main(String[] args) {
        Cube c1 = new Cube();
        Cube c2 = new Cube(5, 5, 5);
        Cube c3 = new Cube(c1);

        c1.volume();
        c2.volume();
        c3.volume();
    }
}