package com.tedu.shoot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 类：英雄机
 */
public class Hero {
    private int width,
            height,
            X,
            Y,
            life,
            doubleFire;
    private BufferedImage[] heroImages = new BufferedImage[6];

    public Hero(){
        try {
            for (int i = 0; i < 6; i++){
                heroImages[i] = ImageIO.read(new File("./images/hero" + i + ".png"));
            }
            width = heroImages[0].getWidth();
            height = heroImages[0].getHeight();
            life = 3;
            doubleFire = 0;
            X = 140;
            Y = 400;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void moveTo(int x, int y){
        System.out.println("英雄机移动了。");
    }

    public void step(){
        System.out.println("英雄机切换图片了。");
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

    public int getLife() {
        return life;
    }

    public int getDoubleFire() {
        return doubleFire;
    }

    public BufferedImage[] getHeroImages() {
        return heroImages;
    }
}
