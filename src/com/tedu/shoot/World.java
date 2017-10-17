package com.tedu.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 测试类
 */
public class World extends JComponent{
    Sky sky;
    Hero hero;
    Airplane airplane1, airplane2;
    BigAirplane bigAirplane1, bigAirplane2;
    Bee bee1, bee2;
    Bullet bullet1, bullet2;
    BufferedImage startImage, pauseImage, gameOverImage;

    // 设置组件大小 以绘制同等大小的窗口
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(sky.getWIDTH(), sky.getHEIGHT());
    }

    // 绘制背景
    @Override
    public void paint(Graphics g) {

        g.drawImage(sky.getSkyImage(),0,0,null);
        g.drawImage(hero.getHeroImages()[0], sky.getWIDTH() / 2 - hero.getWidth() / 2,
                sky.getHEIGHT() * 2 /3, null);
        g.drawImage(startImage, sky.getWIDTH() - startImage.getWidth() -40,
                sky.getHEIGHT() - startImage.getHeight() -20, null);

    }

    /**
     * 测试方法
     */
    void action(){
        init();

    }

    void init(){
        sky = new Sky();
        hero = new Hero();
        airplane1 = new Airplane();
        airplane2 = new Airplane();
        bigAirplane1 = new BigAirplane();
        bigAirplane2 = new BigAirplane();
        bee1 = new Bee();
        bee2 = new Bee();
        bullet1 = new Bullet();
        bullet2 = new Bullet();
        try {
            startImage = ImageIO.read(new File("./images/start.png"));
            pauseImage = ImageIO.read(new File("./images/pause.png"));
            gameOverImage = ImageIO.read(new File("./images/gameover.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args){

        World world = new World();
        world.action();
        // 建立游戏窗口
        JFrame jFrame = new JFrame();
        jFrame.setTitle("The War Of Plane");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 将游戏内容填充到窗口中 并自动识别大小
        jFrame.add(world);
        jFrame.pack();
        // 游戏窗口显示
        jFrame.setVisible(true);

    }
}
