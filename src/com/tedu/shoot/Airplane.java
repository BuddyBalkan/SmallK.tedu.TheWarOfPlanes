package com.tedu.shoot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 类：小敌机
 */
public class Airplane {
    private int WIDTH,
            HEIGHT,
            X,
            Y,
            speed;
    private BufferedImage[] airplaneImages = new BufferedImage[5];

    public Airplane(){
        try {
            for (int i = 0; i < 5; i++){
                airplaneImages[i] = ImageIO.read(new File("./images/airplane" + i + ".png"));
            }
            WIDTH = airplaneImages[0].getWidth();
            HEIGHT = airplaneImages[0].getHeight();
            speed = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void step(){
        System.out.println("小敌机向Y方向移动了");
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

    public BufferedImage[] getAirplaneImages() {
        return airplaneImages;
    }
}
