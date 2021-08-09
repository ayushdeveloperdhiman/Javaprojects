import java.util.ArrayList;

public class Album {
    private final String albumName;
    private final ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<>();
    }
    public boolean addSong(String name,double duration){
        if(search(name)==null){
            songs.add(new Song(name,duration));
            return true;
        }
        return false;
    }
    public  boolean remove(String name){
        if(search(name).getName().equals(name)){
            songs.remove(search(name));
            return true;
        }
        return false;
    }
    private Song search(String name){
        for(Song song:songs){
            if(song.getName().equals(name)){
                return song;
            }
        }
        return null;
    }
    public boolean editSong(String newName,String oldName){
        Song song=search(oldName);
        if(song==null){
            return false;
        }
        song.setName(newName);
        return true;
    }
    public void printAllSongs(){
        for(Song song:songs){
            System.out.println(song.getName());
        }
    }


}
