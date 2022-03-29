class Box {
    private int width;
    private int height;
    private int depth;
    public Box(int width,int height,int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int volume(){
        return (width * height * depth);
    }

}
 public class Assignment0_1{
     public static void main(String[] args) {
        Box box = new Box(10,42,21);
         System.out.println("Volume of a box is : "+box.volume());
     }
 }
