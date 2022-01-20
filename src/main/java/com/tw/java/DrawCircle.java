package com.tw.java;

import processing.core.PApplet;

public class DrawCircle extends PApplet {
    private int BAllX;
    private final int BallY;
    private final int size;
    private final int size1;
    private final int speed;


    public DrawCircle(int BallX, int BallY, int size, int size1, int speed) {

        this.BAllX=BallX;
        this.BallY=BallY;
        this.size=size;
        this.size1=size1;
        this.speed=speed;
    }

    public void DrawEllipse() {
        System.out.println("in drawEllipse "+BAllX+" "+BallY+" "+size+" "+size1);
        ellipse(BAllX,BallY,size,size1);
        BAllX+=speed;
    }
}
