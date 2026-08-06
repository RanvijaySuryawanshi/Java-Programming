class Book{
    String aut, tit, pub;
    Book(String a, String t, String p){
        aut = a;
        tit = t;
        pub = p;
    }
}
class BookInfo extends Book{
    double pri;
    String stps;
    BookInfo(String a, String t, String p, double pr, String sp){
        super(a, t, p);
        pri = pr;
        stps = sp;
    }
    void show(){
        System.out.println("Author = " + aut);
        System.out.println("Title = " + tit);
        System.out.println("Publisher = " + pub);
        System.out.println("Price = " + pri);
        System.out.println("Stock Position = " + stps);
    }
    public static void main(String[] args){
        BookInfo b1 = new BookInfo("J. K. Rowling", "Harry Potter", "ABC", 500, "Available");
        BookInfo b2 = new BookInfo("Rick Riordan", "Percy Jackson", "LMN", 700, "Unavailable");
        BookInfo b3 = new BookInfo("Jeff Kinney", "Diary of a Wimpy Kid", "XYZ", 600, "Available");

        b1.show();
        b2.show();
        b3.show();
    }
}