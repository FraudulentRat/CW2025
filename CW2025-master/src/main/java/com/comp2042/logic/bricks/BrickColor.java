package com.comp2042.logic.bricks;

import java.util.List;
import javafx.scene.paint.Color;
import java.util.concurrent.ThreadLocalRandom;

public class BrickColor implements Brick {
    private final Brick brick;
    private final Color color;

    private static final Color[] COLORS = {
            Color.RED,
            Color.BLUE,
            Color.GREEN,
            Color.YELLOW,
            Color.ORANGE,
            Color.MAGENTA,
            Color.CYAN
    };

    public BrickColor(Brick brick) {
        this.brick = brick;
        this.color = COLORS[ThreadLocalRandom.current().nextInt(COLORS.length)];
    }

    @Override
    public List<int[][]> getShapeMatrix() {
        return brick.getShapeMatrix();
    }

    public Color getColor() {
        return color;
    }
}
