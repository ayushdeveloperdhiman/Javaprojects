public class Animal {
    String name;
    int height;
    int weight;

    public Animal(String name,int height,int weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

}
