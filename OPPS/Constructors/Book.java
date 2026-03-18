package OPPS.Constructors;

public class Book {
    String title;
    String author;
    int price;

    Book(String t,String a,int p){
        title = t;
        author = a;
        price = p;
    }

    void show(){
        System.out.println("Book title :"+title);
        System.out.println("Book Author :"+author);
        System.out.println("Book Price :"+price);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book("abc","xyz",100);
        b1.show();
        Book b2 = new Book("pmw","kdl",380);
        b2.show();

    }
}
