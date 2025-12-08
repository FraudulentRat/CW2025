package com.comp2042;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ManageSound {

    private static final String movementSound = "/Tetris-block-move-sound-effect.mp3";
    private static final String lineComplete = "/nintendo-game-boy-startup.mp3";
    private static final String itsover = "/game-over-417465.mp3";

    private static MediaPlayer mediaPlayer;

    private static void playSound(String path) {
        try {
            Media sound = new Media(ManageSound.class.getResource(path).toExternalForm());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to play sound: " + path);
        }
    }

        public static void playMove() {
        playSound(movementSound);
    }

    public static void playLineClear() {
        playSound(lineComplete);
    }

    public static void playGameOver() {
        playSound(itsover);
    }
}
