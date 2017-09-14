package com.harium.etyl.paparazzi;

import com.harium.etyl.awt.AWTGraphics;
import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.layer.GeometricLayer;

import java.awt.image.BufferedImage;

public class Paparazzi {

    public static BufferedImage takeScreenShot(Application application) {
        BufferedImage image = new BufferedImage(application.getW(), application.getH(), BufferedImage.TYPE_INT_RGB);
        drawInSource(application, image);
        return image;
    }

    public static BufferedImage takeScreenShot(Application application, GeometricLayer rectangle) {
        BufferedImage image = new BufferedImage(rectangle.getW(), rectangle.getH(), BufferedImage.TYPE_INT_RGB);
        drawInSource(application, image, rectangle);
        return image;
    }

    public static BufferedImage takeScreenShot(Application application, int x, int y, int w, int h) {
        return takeScreenShot(application, new GeometricLayer(x, y, w, h));
    }

    public static BufferedImage takeScreenShotWithTransparency(Application application) {
        BufferedImage image = new BufferedImage(application.getW(), application.getH(), BufferedImage.TYPE_INT_ARGB);
        drawInSource(application, image);
        return image;
    }

    public static BufferedImage takeScreenShotWithTransparency(Application application, GeometricLayer rectangle) {
        BufferedImage image = new BufferedImage(rectangle.getW(), rectangle.getH(), BufferedImage.TYPE_INT_ARGB);
        drawInSource(application, image, rectangle);
        return image;
    }

    public static BufferedImage takeScreenShotWithTransparency(Application application, int x, int y, int w, int h) {
        return takeScreenShotWithTransparency(application, new GeometricLayer(x, y, w, h));
    }

    private static void drawInSource(Application application, BufferedImage source) {
        AWTGraphics graphics = new AWTGraphics(source);
        application.draw(graphics);
    }

    private static void drawInSource(Application application, BufferedImage source, GeometricLayer layer) {
        AWTGraphics graphics = new AWTGraphics(source);
        graphics.setClip(layer.getX(), layer.getY(), layer.getW(), layer.getH());
        application.draw(graphics);
    }
}
