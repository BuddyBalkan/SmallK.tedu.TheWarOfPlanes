package com.tedu.shoot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 类：大敌机
 */
public class BigAirplane {
    private int WIDTH,
            HEIGHT,
            X,
            Y,
            speed;
    private BufferedImage[] bigAirplaneImages = new BufferedImage[5];

    public BigAirplane(){
        try {
            for (int i = 0; i < 5; i++){
                bigAirplaneImages[i] = ImageIO.read(new File("./images/bigplane" + i + ".png"));
            }
            WIDTH = bigAirplaneImages[0].getWidth();
            HEIGHT = bigAirplaneImages[0].getHeight();
            speed = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void step(){
        System.out.println("大敌机向Y方向移动了");
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

    public int getSpeed() {
        return speed;
    }

    public BufferedImage[] getBigAirplaneImages() {
        return bigAirplaneImages;
    }
}
