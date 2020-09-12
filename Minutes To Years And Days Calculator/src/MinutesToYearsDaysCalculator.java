public class MinutesToYearsDaysCalculator {
    public static void main(String[]args){

        printYearsAndDays(561600L);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid value");
        }
        long year=minutes/525600;
        long day=(minutes/60/24)%365;
        System.out.println(minutes+" min = "+year+" y "+day+" d");

    }
}
