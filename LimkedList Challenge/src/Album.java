import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String name, double duration) {
        Song foundSong = findSong(name);
        if (foundSong == null) {
            songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(name)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int numberOfSongs, LinkedList<Song> playlist) {
        if(numberOfSongs<=0&&numberOfSongs>songs.size()){
            return false;
        }
        Song foundSong = findSong(songs.get(numberOfSongs - 1).getTitle());
        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String name, LinkedList<Song> playlist) {
        Song foundSong = findSong(name);
        if (foundSong != null) {
            playlist.add(foundSong);
            return true;
        }
        return false;
    }
}
