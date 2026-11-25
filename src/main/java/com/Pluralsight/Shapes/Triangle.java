package com.Pluralsight.Shapes;

import com.Pluralsight.forms.Turtle;

import java.awt.*;

public class Triangle extends Shape {

    private double sideLength;
    private double angle;

    public Triangle(Turtle turtle, Point location, String color, int width, double angle,  double sideLength) {
        super(turtle, location, color, width);
        this.angle =  angle;
        this.sideLength = sideLength;

    }

    public void side(){

    }

    @Override
    public void paint(Graphics g) {

    }
}
