package AdapterPattern.concretes;

import AdapterPattern.interfaces.AdvancedMediaPlayer;

/**
 * Created by khanhtc on 4/22/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
