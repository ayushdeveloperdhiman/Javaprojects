public class BarkingDog {
    public static  boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(barking && hourOfDay<8 && hourOfDay>-1 || hourOfDay==23){
            return true;
        }else{
            return false;
        }
}
    }

