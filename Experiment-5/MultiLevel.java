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
}
class BookSales extends BookInfo{
    int noOfCopiesSold;
    BookSales(String a, String t, String p, double pr, String sp, int n){
        super(a, t, p, pr, sp);
        noOfCopiesSold = n;
    }
    void revenueGenerated(){
        System.out.println("Revenue = " + (pri * noOfCopiesSold));
    }
    void allShow(){
        System.out.println("Author = " + aut);
        System.out.println("Title = " + tit);
        System.out.println("Publisher = " + pub);
        System.out.println("Price = " + pri);
        System.out.println("Stock Position = " + stps);
        System.out.println("Copies Sold = " + noOfCopiesSold);
        revenueGenerated();
    }
    public static void main(String[] args){
        BookSales b = new BookSales("J. K. Rowling", "Harry Potter", "ABC", 500, "Available" ,17);
        b.allShow();
    }
}