package com.comp2042;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class BGM {

    private static MediaPlayer music;

    public static void playMusic() {
        if (music == null) {
            String path = BGM.class
                    .getResource("/Pufino - Enlivening (freetouse.com).mp3")
                    .toExternalForm();

            Media media = new Media(path);
            music = new MediaPlayer(media);

            music.setCycleCount(music.INDEFINITE);
            music.setVolume(0.5);
        }

        music.play();
    }

    public static void stopMusic() {
        if (music != null) {
            music.stop();
        }
    }
}
