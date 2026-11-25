package com.Pluralsight.Shapes;

import com.Pluralsight.forms.Turtle;

import java.awt.Point;

public abstract class Shape implements Paintable{
    private Turtle turtle;
    private Point location;
    private String color;
    private int width;

    public Shape(Turtle turtle, Point location, String color, int width) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.width = width;
    }


    //setters and getters-----------------------------------------------------------------------------------------------|
    protected Turtle getTurtle() {
        return turtle;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
