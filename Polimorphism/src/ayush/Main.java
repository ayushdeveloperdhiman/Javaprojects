package ayush;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A sharks eat lot of peoples.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    public String plot() {
        return "Alien attempts to attack earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return "Kid try and escape a Maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable.");
    }

}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+": "+movie.getName()+"\n"+"Plot: "+movie.plot()+"\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated = " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }
}
