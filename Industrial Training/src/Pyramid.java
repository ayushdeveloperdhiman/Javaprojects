public class Pyramid {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=7-i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
