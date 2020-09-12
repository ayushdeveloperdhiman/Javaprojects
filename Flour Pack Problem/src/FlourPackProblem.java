public class FlourPackProblem {
public static void main(String[]args){
    System.out.println(canPack(2,2,11));
}

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal <0){
            return false;
        }

        int kilos = bigCount * 5 + smallCount;
        int remainingBags = goal % 5;

        if(kilos > goal){
            return smallCount >= remainingBags;
        }

        return kilos == goal;

    }
}
