package oop01;

public class MusicPlayerMain04 {
    public static void main(String[] args) {
        MusicPlayer mp=new MusicPlayer();
        
        mp.on();
        mp.showStatus();
        mp.volumeUp();
        mp.volumeUp();
        mp.volumeDown();
        mp.off();
    }
}
