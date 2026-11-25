package com.Pluralsight.Shapes;

import com.Pluralsight.forms.Turtle;

import java.awt.*;

public class Hexagon extends Shape {

    private double sideLength;
    private double angle;

    public Hexagon(Turtle turtle, Point location, String color, int width, double angle,  double sideLength) {
        super(turtle, location, color, width);
        this.angle =  angle;
        this.sideLength = sideLength;
    }



    @Override
    public void paint(Graphics g) {

    }
}
