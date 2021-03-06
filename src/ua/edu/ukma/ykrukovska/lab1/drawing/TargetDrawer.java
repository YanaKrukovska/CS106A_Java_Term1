package ua.edu.ukma.ykrukovska.lab1.drawing;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

public class TargetDrawer extends GraphicsProgram {

    private static final int CIRCLE_AMOUNT = 5;
    private static final int FIRST_RADIUS = 600;
    private static final int WORLD_HEIGHT = 500;
    private static final int WORLD_WIDTH = 500;

    public void run() {

        this.setSize(WORLD_WIDTH, WORLD_HEIGHT);

        for (int i = CIRCLE_AMOUNT; i > 0; i--) {
            double radius = ((double) i / CIRCLE_AMOUNT) * FIRST_RADIUS;

            GOval circle = new GOval((WORLD_WIDTH / 2.) - radius, (WORLD_HEIGHT / 2.) - radius, radius * 2, radius * 2);
            circle.setColor(getCircleBorderColor(i));
            circle.setFilled(true);
            circle.setFillColor(getCircleColor(i));
            add(circle);
        }
    }

    private Color getCircleBorderColor(int i) {
        if (i % 2 == 0) {
            return Color.red;
        } else {
            return Color.white;
        }
    }

    private Color getCircleColor(int i) {
        if (i % 2 == 0) {
            return Color.red;
        } else {
            return Color.white;
        }
    }
}
