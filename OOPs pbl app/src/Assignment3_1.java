class Fruit{
    private String name =null;
    private String taste=null;
    private int size =0;


    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void eat(){
        System.out.println("Name :"+name+" Taste :"+taste);
    }

}

class Apple extends Fruit{

    public Apple(String taste, int size) {
        setName("Apple");
        setTaste(taste);
        setSize(size);
    }

    @Override
    public void eat() {
        System.out.println("Name :"+getName()+" Taste :"+getTaste());
    }
}

class Orange extends Fruit{


    public Orange( String taste, int size) {
        setName("Orange");
        setTaste(taste);
        setSize(size);
    }

    @Override
    public void eat() {
        super.eat();
    }
}

public class Assignment3_1 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple("Sweet",25);
        Orange orange = new Orange("Sour",24);

        fruit.eat();
        apple.eat();
        orange.eat();
    }
}
