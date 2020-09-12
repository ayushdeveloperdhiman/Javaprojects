public class GreatestCommonDivisor {
    public static void main(String[]args){
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(10,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
    public static int getGreatestCommonDivisor(int first,int second){
        if (first<10||second<10){
            return -1;
        }
        int min=Math.min(first,second);
        while(min>=0){
            if(first%min==0&&second%min==0){
                return min;
            }
            min--;
        }
        return 0;
    }
}
