package Interfaces.music.string;

import Interfaces.music.Playable;

public class Veena implements Playable {

    @Override
    public void play() {
        System.out.println("Playing veena...");
    }
}
