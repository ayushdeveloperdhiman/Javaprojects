public class LeftTriangle {
    public static void main(String[] args) {
        int j,i,k;
        for(i=5;i>=0;i--){
            for(j=0;j<=i-1;j++){
                System.out.print(" ");
            }
            for(k=5;k>=j;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
