package com.mycompany.hw1;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        if (direction > 180 || direction < -180) {
            throw new IllegalArgumentException("Change the value of direction! It must be between -180 and 180.");
        }
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[ (" +
                x + "," + y +
                "), speed=(" +
                xDelta + "," + yDelta +
                ") ]";
    }
}
