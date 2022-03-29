class Author{
    private String name,email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

}


public class Assignment1_1 {
    public static void main(String[] args) {
        Author author =new Author("Ayush Dhiman","ayushdeveloper0711@gmail.com",'M');
        Book book = new Book("Java SE8 For developers",author,200.00,5);
        System.out.println("Book name : "+book.getName()+"; \tauthor : "+book.getAuthor().getName()
        +"; \tprice : "+book.getPrice()+"; \tQuantity : "+book.getQtyInStock());
    }
}
