public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);

    }

   public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }else{
            int rowCount,columnCount,currentRow;
            rowCount=columnCount=number;
            for(int row=0;row<number;row++){
                currentRow=row;
                for(int column=0;column<columnCount;column++){
                    if(row==0||column==0||row==rowCount-1||column==columnCount-1||row==column||column==(rowCount-currentRow-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}


