package Interfaces.live;

import Interfaces.music.Playable;
import Interfaces.music.string.Veena;
import Interfaces.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable playable = veena;
        playable.play();

        Playable playable1 = saxophone;
        saxophone.play();
    }
}
