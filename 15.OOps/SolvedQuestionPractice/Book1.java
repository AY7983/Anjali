class Book{
    int  price;
    static int count;

    public Book(int price){    // constructor called  when the new obj create
        this.price = price;
        count++;

    }
}

public class Book1{
    public static void main(String[] args) {
        System.out.print(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.print(Book.count);
    }
}