package com.tedu.shoot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 类：子弹
 */
public class Bullet {
    private int width,
            height,
            X,
            Y,
            speed;
    private BufferedImage bulletImage;

    public Bullet(){
        try {
            bulletImage = ImageIO.read(new File("./images/bullet.png"));
            width = bulletImage.getWidth();
            height = bulletImage.getHeight();
            speed = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void step(){
        System.out.println("子弹移动了。");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getSpeed() {
        return speed;
    }

    public BufferedImage getBulletImage() {
        return bulletImage;
    }
}
