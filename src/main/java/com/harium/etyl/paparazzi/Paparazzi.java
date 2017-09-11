package com.harium.etyl.paparazzi;

import com.harium.etyl.awt.AWTGraphics;
import com.harium.etyl.commons.context.Application;

import java.awt.image.BufferedImage;

public class Paparazzi {

    public static BufferedImage takeScreenShot(Application application) {
        BufferedImage image = new BufferedImage(application.getW(), application.getH(), BufferedImage.TYPE_INT_RGB);
        drawInSource(application, image);
        return image;
    }

    public static BufferedImage takeScreenShotWithTransparency(Application application) {
        BufferedImage image = new BufferedImage(application.getW(), application.getH(), BufferedImage.TYPE_INT_ARGB);
        drawInSource(application, image);
        return image;
    }

    private static void drawInSource(Application application, BufferedImage source) {
        AWTGraphics graphics = new AWTGraphics(source);
        application.draw(graphics);
    }
}
