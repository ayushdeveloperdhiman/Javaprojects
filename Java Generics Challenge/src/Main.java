public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague=new League<>("AFL");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        footballLeague.add(melbourne);
        footballLeague.add(adelaideCrows);
        footballLeague.add(fremantle);
        footballLeague.add(hawthorn);
        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        footballLeague.showLeague();
    }
}
