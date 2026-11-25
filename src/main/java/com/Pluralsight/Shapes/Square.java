package com.Pluralsight.Shapes;

import com.Pluralsight.forms.Turtle;

import java.awt.*;

public class Square extends Shape {

    private double length;

    public Square(Turtle turtle, Point location, String color, int width) {
        super(turtle, location, color, width);
    }


    @Override
    public void paint(Graphics g) {

    }
}
