package com.tedu.shoot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 类：天空
 */
public class Sky {
    private int WIDTH,
            HEIGHT,
            X,
            Y,
            SPEED,
            y1;
    private BufferedImage skyImage;

    public Sky(){
        try {
            skyImage = ImageIO.read(new File("./images/background.png"));
            X = 0;
            Y = 0;
            y1 = -HEIGHT;
            SPEED = 2;
            WIDTH = skyImage.getWidth();
            HEIGHT = skyImage.getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void step(){
        System.out.println("天空移动了。");
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getY1() {
        return y1;
    }

    public BufferedImage getSkyImage() {
        return skyImage;
    }
}
