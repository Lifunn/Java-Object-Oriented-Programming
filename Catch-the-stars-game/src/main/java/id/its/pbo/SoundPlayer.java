package id.its.pbo;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class SoundPlayer {
    private Clip clip;

    public SoundPlayer(String soundFileName) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        URL soundFile = getClass().getResource("/" + soundFileName);
        if (soundFile == null) {
            throw new IOException("Sound file not found: " + soundFileName);
        }
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
    }

    public void play() {
        if (clip != null) {
            clip.stop();
            clip.setFramePosition(0);
            clip.start();
        }
    }
}