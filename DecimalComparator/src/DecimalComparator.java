public class DecimalComparator {

    public static void main(String[]args){

        boolean result=areEqualByThreeDecimalPlaces(3.0125,3.0126);
        System.out.println(result);

    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        if((int)(num1*1000)==(int)(num2*1000)){
            return true;
        }
        return false;
    }
}

