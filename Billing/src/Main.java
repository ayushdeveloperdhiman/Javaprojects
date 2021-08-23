import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Food> menuList=new Vector<>();
        Food temp=new Food("Pizza",150);
        menuList.add(temp);
        temp=new Food("Burger",30);
        menuList.add(temp);
        temp=new Food("French fries",50);
        menuList.add(temp);
        temp=new Food("Maggie",30);
        menuList.add(temp);
        temp=new Food("Rajmah rice ",70);
        menuList.add(temp);

        for(Food list:menuList){
            System.out.println(list);
        }
    }
}
