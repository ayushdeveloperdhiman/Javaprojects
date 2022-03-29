class Shape{
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}
public class Assignment3_2 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();
        r.draw();
        r.erase();
        s.draw();
        s.erase();

    }
}
