package com.mycompany.HorstmannTasks.InheritReflect;

public abstract class Shape implements Cloneable{

    Point point = new Point(3,4);

    private double dx;
    private double dy;

    public Shape() {
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    public abstract Point getCenter();

    public Shape clone() {
        try {
            return (Shape) super.clone();
        }
        catch( CloneNotSupportedException ex ) {
            throw new InternalError();
        }
    }

}
