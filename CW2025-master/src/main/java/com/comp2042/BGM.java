package com.comp2042;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class BGM {

    private static MediaPlayer menu_music;
    private static MediaPlayer game_music;

    public static void playMenuMusic() {
        if (menu_music == null) {
            String path = BGM.class
                    .getResource("/Pufino - Enlivening (freetouse.com).mp3")
                    .toExternalForm();

            Media media = new Media(path);
            menu_music = new MediaPlayer(media);

            menu_music.setCycleCount(menu_music.INDEFINITE);
            menu_music.setVolume(0.5);
        }

        stopGameMusic();
        menu_music.play();
    }

    public static void playGameMusic() {
        if (game_music == null) {
            String path = BGM.class
                    .getResource("/Dagored - Wall Of Sound (freetouse.com).mp3")
                    .toExternalForm();

            Media media = new Media(path);
            game_music = new MediaPlayer(media);

            game_music.setCycleCount(game_music.INDEFINITE);
            game_music.setVolume(0.5);
        }

        stopMenuMusic();
        game_music.play();
    }

    public static void stopMenuMusic() {
        if (menu_music != null) {
            menu_music.stop();
        }
    }
    public static void stopGameMusic() {
        if (game_music != null) {
            game_music.stop();
        }
    }

    public static void stopALLMusic() {
        stopMenuMusic();
        stopGameMusic();
    }
}
