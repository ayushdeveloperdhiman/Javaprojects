public class GreatestOfTenNumber {
    public static void main(String[] args) {
        int a1=10,a2=1,a3=5,a4=20,a5=40,a6=70,a7=12,a8=30,a9=45,a10=36;
        if(a1>a2 && a1>a3 && a1>a4 && a1>a5 && a1>a6 && a1>a7 && a1>a8 && a1>a9 && a1>a10){
            System.out.println("a1 is greater");
        }else if(a2>a3 && a2>a4 && a2>a5 && a2>a6 && a2>a7 && a2>a8 && a2>a9 && a2>a10){
            System.out.println("a2 is greater");
        }else if(a3>a4 && a3>a5 && a3>a6 && a3>a7 && a3>a8 && a3>a9 && a3>a10){
            System.out.println("a3 is greater");
        }else if(a4>a5 && a4>a6 && a4>a7 && a4>a8 && a4>a9 && a4>a10){
            System.out.println("a4 is greater");
        }else if(a5>a6 && a5>a7 && a5>a8 && a5>a9 && a5>a10){
            System.out.println("a5 is greater");
        }else if(a6>a7 && a6>a8 && a6>a9 && a6>a10){
            System.out.println("a6 is greater");
        }else if(a7>a8 && a7>a9 && a7>a10){
            System.out.println("a7 is greater");
        }else if(a8>a9 && a8>a10){
            System.out.println("a8 is greater");
        }else if(a9>a10){
            System.out.println("a9 is greater");
        }else{
            System.out.println("a10 is greater");
        }
    }
}
