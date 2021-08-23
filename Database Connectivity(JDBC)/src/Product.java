public class Product {
    int id,price;
    String name;

    public Product(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public int getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t\t\t\t\t\t\t"+"Price: "+price;
    }
}
