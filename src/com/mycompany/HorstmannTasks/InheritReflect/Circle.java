package com.mycompany.HorstmannTasks.InheritReflect;

public class Circle extends Shape{

    private double radius;

    public Circle(Point center, double radius) {
        this.point = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }
}
