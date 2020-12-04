package com.BrickBall;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    public static void backGround() {
            try {
                AudioInputStream audioInputStream1 = AudioSystem.getAudioInputStream(new File("brickball background.wav").getAbsoluteFile());
                Clip clip1 = AudioSystem.getClip();
                clip1.open(audioInputStream1);
                clip1.start();
                clip1.loop(Clip.LOOP_CONTINUOUSLY);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
