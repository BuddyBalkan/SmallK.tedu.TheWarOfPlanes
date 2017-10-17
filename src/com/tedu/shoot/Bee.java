package com.tedu.shoot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 类：小蜜蜂
 */
public class Bee {
    private int WIDTH,
            HEIGHT,
            X,
            Y,
            speedX = 2,
            speedY = 1,
            awardType;
    private BufferedImage[] beeImages = new BufferedImage[5];

    public Bee(){
        try {
            for (int i = 0; i < 5; i++){
                beeImages[i] = ImageIO.read(new File("./images/bee" + i +".png"));
            }
            WIDTH = beeImages[0].getWidth();
            HEIGHT = beeImages[0].getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }
        X = 150;
        Y = 80;
        awardType = 0;
    }

    public void step(){
        System.out.println("小蜜蜂向X方向移动了");
        System.out.println("小蜜蜂向Y方向移动了");
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

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public int getAwardType() {
        return awardType;
    }

    public BufferedImage[] getBeeImages() {
        return beeImages;
    }
}
