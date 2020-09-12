public class While {
    public static void main(String[] args) {
        int number = 4;
        int finalNumber = 20;
        int count = 0;
        while (number <= finalNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number = " + number);

            count++;
            if (count >= 5) {
                break;
            }


        }
        System.out.println("Total even numbers found = " + count);


        //    int count=6;
        //    while(count!=6){
        //        System.out.println(count);
        //        count++;
        //    }
        //    count=1;
        //    do{
        //        System.out.println(count);
        //        count++;
        //    }while(count!=6);
    }

    public static boolean isEvenNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
