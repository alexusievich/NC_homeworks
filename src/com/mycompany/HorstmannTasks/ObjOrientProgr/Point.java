package com.mycompany.HorstmannTasks.ObjOrientProgr;

public final class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Point scale(double a) {
        this.x *= a;
        this.y *= a;
        return this;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
