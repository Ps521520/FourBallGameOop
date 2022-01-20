package com.tw.java;

import processing.core.PApplet;

public class FourBallOop extends PApplet{
    private int firstBallX =0;
    private int secondBallX =0;
    private int thirdBallX =0;
    private int fourthBallX =0;
    private int firstBallY =200;
    private int secondBallY =300;
    private int thirdBallY =400;
    private int fourthBallY =500;
    private int size=10;
    private int speed=1;
//    DrawCircle drawFirstCircle;
//    DrawCircle drawSecondCircle;
//    DrawCircle drawThirdCircle;
//    DrawCircle drawFourthCircle;

    public static void main(String args[]){
        PApplet.main("com.tw.java.FourBallOop",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(800,600);
    }

    @Override
    public void setup() {
//        System.out.println("in setup");
//        drawFirstCircle = new DrawCircle(firstBallX, firstBallY, size, size, speed);
//        drawSecondCircle = new DrawCircle(secondBallX,secondBallY,size,size,speed+1);
//        drawThirdCircle = new DrawCircle(thirdBallX,thirdBallY,size,size,speed+2);
//        drawFourthCircle = new DrawCircle(fourthBallX,fourthBallY,size,size,speed+3);
//        System.out.println("out setup");
        draw();
    }

    @Override
    public void draw() {
//        System.out.println("in draw");
//        drawFirstCircle.DrawEllipse();
//        drawSecondCircle.DrawEllipse();
//        drawThirdCircle.DrawEllipse();
//        drawFourthCircle.DrawEllipse();
        ellipse(firstBallX,firstBallY,size,size);
        firstBallX++;
        ellipse(secondBallX,secondBallY,size,size);
        secondBallX+=2;
        ellipse(thirdBallX,thirdBallY,size,size);
        thirdBallX+=3;
        ellipse(fourthBallX,fourthBallY,size,size);
        fourthBallX+=4;
    }
}
