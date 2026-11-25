package com.Pluralsight.Shapes;

import com.Pluralsight.forms.Turtle;

import java.awt.*;

public class Square extends Shape {
    private double sideLength;
    private double angle;

    public Square(Turtle turtle, Point location, String color, int width,double sideLength, double angle) {
        super(turtle, location, color, width);
        this.sideLength = sideLength;
        this.angle = angle;
    }

    public void sides(){

    }
    @Override
    public void paint(Graphics g) {

    }
}
