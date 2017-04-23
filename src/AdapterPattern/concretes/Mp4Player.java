package AdapterPattern.concretes;

import AdapterPattern.interfaces.AdvancedMediaPlayer;

/**
 * Created by khanhtc on 4/22/17.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
