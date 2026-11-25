package com.Pluralsight;

import com.Pluralsight.forms.Turtle;
import com.Pluralsight.forms.World;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 1000;
        int height = 1000;

//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);

        turtle.setShellSize(15); // Making a bigger turtle

        world.setLocation(0,0);

        //turtle.drop("src/main/resources/tortuga-ninja.png", 250); adding a pic
        
        //square
//        turtle.setDelay(0.005);
//        for (int i = 0; i < 4; i++){
//            turtle.turnRight(90);
//            turtle.forward();
//        }

        double radio = 100;
        //The arc length formula is: 1° = 2πr / 360
        double step = 2 * Math.PI * radio / 360;

        // circle
//        turtle.setDelay(0.005);
//        for (int i = 0; i < 360; i++) {
//            turtle.forward(step);
//            turtle.turnRight(1);
//        }

        //parts
        Turtle turtle2 = new Turtle(world,-70, -80);
        //trutle 1 :
        turtle.setDelay(0.005);
        turtle.forward(radio);


        //trutle 1 :
        turtle.turnLeft(90);
        for (int i = 0; i < 270; i++) {
            turtle.forward(step);
            turtle.turnLeft(1);

        }

        turtle.turnLeft(90);
        turtle.forward(radio);

        //turtle 2 :
        turtle2.setShellSize(15);
        turtle2.setColor(Color.RED);
        turtle2.setDelay(0.005);

        turtle2.forward(radio);
        turtle2.turnRight(90);
        for (int i = 0; i < 90; i++) {
            turtle2.forward(step);
            turtle2.turnRight(1);
        }
        turtle2.turnRight(90);
        turtle2.forward(radio);

    }
}
