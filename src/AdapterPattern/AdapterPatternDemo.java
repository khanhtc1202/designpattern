package AdapterPattern;

import AdapterPattern.concretes.AudioPlayer;

/**
 * Created by khanhtc on 4/22/17.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "aloha.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far_far_away.vlc");
        audioPlayer.play("avi", "home_alone.avi");
    }
}
