public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mercedes obj = new Mercedes();
        Ford obj1 = new Ford();
        Car obj2 = new Car();
        obj.startEngine();
        obj1.startEngine();
        obj2.startEngine();
    }

}

class Car {
    void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting");
    }
}

class Ford extends Car {

}

class Mercedes extends Car {

}

