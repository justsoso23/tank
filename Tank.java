package com.sxt;

import java.awt.*;

public abstract class Tank extends GameObject{

    private String upImage; //向上移动时的图片
    private String downImage;//向下移动时的图片
    private String rightImage;//向右移动时的图片
    private String leftImage;//向左移动时的图片
    //坦克size
    private int width = 40;
    private int height = 50;
     private int speed = 3;
    Direction direction = Direction.UP;
    //坦克速度
   

    //坦克坐标，方向，图片，方向，面板
    public Tank(String img, int x, int y, String upImage, String downImage, String leftImage, String rightImage, GamePanel gamePanel) {
        super(img, x, y, gamePanel);
        this.upImage = upImage;
        this.leftImage = leftImage;
        this.downImage = downImage;
        this.rightImage = rightImage;
    }

    public abstract void paintSelf(Graphics g);

    public abstract Rectangle getRec();
       
    }

