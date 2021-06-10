import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList arrayList=new ArrayList();
       /* ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(60);
        //arrayList.add("Ayush");
        arrayList.add(20);
        arrayList.add(21);
        printDoubled(arrayList);*/
        FootballPlayer ram=new FootballPlayer("Ram");
        BaseballPlayer sam=new BaseballPlayer("sam");
        SoccerPlayer sayam=new SoccerPlayer("Sayam");
        Team deadlyPlayers=new Team("Deadly Player");
        deadlyPlayers.addPlayer(ram);
        deadlyPlayers.addPlayer(sam);
        deadlyPlayers.addPlayer(sayam);

        System.out.println(deadlyPlayers.numPlayer());

    }

    public static void printDoubled(ArrayList<Integer> n) {
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }
}
