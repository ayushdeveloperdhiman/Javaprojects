package ayush;

class Car {
    private String name;
    private boolean engine;
    private int cylinders, wheels, doors;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car.startEngine() called.";
    }

    public String accelerate() {
        return "Car.accelerate() called.";
    }

    public String brake() {
        return "Car.brake() called.";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}

class Lamborghini extends Car {
    public Lamborghini() {
        super("Lamborghini", 4);
    }

    public String startEngine() {
        return getClass().getSimpleName()+".startEngine() called.";
    }

    public String accelerate() {
        return getClass().getSimpleName()+".accelerate() called.";
    }

    public String brake() {
        return getClass().getSimpleName()+".brake() called.";
    }
}

class Mercedes extends Car {
    public Mercedes() {
        super("Mercedes", 2);
    }

    public String startEngine() {
        return getClass().getSimpleName()+".startEngine() called";
    }

    public String accelerate() {
        return "Mercedes.accelerate() called.";
    }

    public String brake() {
        return "Mercedes.brake() called.";
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 3);
    }

    public String startEngine() {
        return "Ferrari.startEngine() called.";
    }

    public String accelerate() {
        return "Ferrari.accelerate() called.";
    }

    public String brake() {
        return "Ferrari.brake() called.";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car=new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lamborghini lamborghini=new Lamborghini();
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.brake());

        Mercedes mercedes=new Mercedes();
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        Ferrari ferrari=new Ferrari();
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());
    }
}
