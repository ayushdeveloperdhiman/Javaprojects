public class SecondsAndMinutes {
    private static final String  INVALID_VALUE_MESSAGE="Invalid value";
    public static void main(String[]args){


        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-54));
        System.out.println(getDurationString(65,9));
       
    }

    public static String getDurationString(long minutes,long seconds){
        if(minutes<0||seconds<0||seconds>59){

            return INVALID_VALUE_MESSAGE;}
        long hours=minutes/60;
        long remMinutes=minutes%60;
        String hoursString=hours+"h ";
        if (hours<10){
            hoursString="0"+hoursString;
        }
        String remMinutesString=remMinutes+"m ";
        if (remMinutes<10){
            remMinutesString="0"+remMinutesString;
        }
        String secondsString=seconds+"s";
        if (seconds<10){
            secondsString="0"+secondsString;
        }
        return hoursString+remMinutesString+secondsString;
        }
    public static String getDurationString(long seconds){
        if (seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes=seconds/60;
        long remSeconds=seconds%60;
        return getDurationString(minutes,remSeconds);
    }

}
