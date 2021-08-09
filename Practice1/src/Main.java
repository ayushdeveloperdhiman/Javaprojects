public class Main {
    public static void main(String[] args) {
        Album albumNew =new Album("New songs");
        Album albumOld=new Album("Old songs");
        albumNew.addSong("Ayush",12.0);
        albumNew.addSong("Dhiman",14);
        albumNew.addSong("Aydhd",45);
        albumNew.addSong("hi",14);
        albumNew.addSong("hey",40);

        albumOld.addSong("song1",45);
        albumOld.addSong("song2",41);
        albumOld.addSong("song3",41);

        System.out.println("album new songs");
        albumNew.printAllSongs();

        albumNew.editSong("Jawaani","Ayush");

        System.out.println("album new songs");
        albumNew.printAllSongs();
    }
}
