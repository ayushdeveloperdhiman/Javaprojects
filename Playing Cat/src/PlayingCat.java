public class PlayingCat {
    public static void main(String[]args){
        boolean a=isCatPlaying(false,35);
        System.out.println(a);
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(summer==false){
            if (temperature>=25&&temperature<=35){
                return true;
            }
            return false;
        }else{
            if (temperature>=25&&temperature<=45){
                return true;
            }
        }return false;
    }
}
