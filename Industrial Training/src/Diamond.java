public class Diamond {
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
        for(int i=7;i>=0;i--){
            for(int k=7;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
