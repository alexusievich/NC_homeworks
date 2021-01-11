package com.mycompany.HorstmannTasks.InheritReflect;

public class Circle extends Shape implements Cloneable{

    private double radius;

    public Circle(Point center, double radius) {
        this.point = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    public Circle clone() {
        return (Circle) super.clone();
    }
}
