package ayush;

public class Main {

    public static void main(String[] args) {
        int switchValue=6;
        switch(switchValue){
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("value is two");
                break;
            case 3: case 4: case 5: case 6:
                System.out.println("Value is either 3,4,5 or 6");
                System.out.println("Actually value is "+switchValue);
                break;
            default:
                System.out.println("Value is not 1,2,3,4,5 or 6");

        }

        char switchCh='A';
        switch (switchCh){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':case'D':case'E':
                System.out.println(switchCh+" was found");
                break;
            default:
                System.out.println("Not found");
        }

        String months="JaNuArY";
        switch (months.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
        }

    }
}
