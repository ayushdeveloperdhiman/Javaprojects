package Interfaces.music.wind;

import Interfaces.music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing saxophone....");
    }
}
