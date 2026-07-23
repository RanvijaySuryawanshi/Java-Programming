class Mobile{
    String Company;
    double Size;
    Mobile(){
        Company = "Samsung";
        Size = 6.5;
    }
    Mobile(String c, double s){
        Company = c;
        Size = s;
    }
    Mobile(Mobile m){
        Company = m.Company;
        Size = m.Size;
    }
    void display(){
        System.out.println("Company: " + Company);
        System.out.println("Screen Size: " + Size + " inches");
        System.out.println();
    }
    public static void main(String[] args){
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Apple", 6.1);
        Mobile m3 = new Mobile("OnePlus", 6.7);
        Mobile m4 = new Mobile("Xiaomi", 6.67);
        Mobile m5 = new Mobile(m2);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}