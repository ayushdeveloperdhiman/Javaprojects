import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    static Button btnPrint=new Button("Print");
    public static void main(String[] args){
        /*GearBox mcLaren=new GearBox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
        mcLaren.operateClutch(true);
        System.out.println(mcLaren.wheelSpeed(6000)):*/
        /*class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached.");
            }
            public void onClick(String tittle){
                System.out.println(tittle+" was clicked.");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());*/
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String tittle) {
                System.out.println(tittle+ " was clicked");
            }
        });
        listen();
    }
    public static void listen(){
        boolean quit=false;
        while(!quit){
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
