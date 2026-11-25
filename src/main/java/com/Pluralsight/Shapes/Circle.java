package com.Pluralsight.Shapes;

import com.Pluralsight.forms.Turtle;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private double step ;

    public Circle(Turtle turtle, Point location, String color, int width) {
        super(turtle, location, color, width);
        this.radius = radius;
        this.step = 2 * Math.PI * radius/ 360;
    }


    @Override
    public void paint(Graphics g) {

    }
}
