package com.mycompany.hw1.ball;

import com.mycompany.hw1.ball.Ball;

import java.util.Objects;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }


    public boolean collides(Ball ball) {
        if (ball.getX() + ball.getRadius() < this.x2 && ball.getX() - ball.getRadius() > this.x1
        && ball.getY() + ball.getRadius() < this.y2 && ball.getY() - ball.getRadius() > this.y1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Container[ (" +
                x1 + "," + y1 +
                "), (" + x2 + "," + y2 +
                ") ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return getWidth() == container.getWidth() &&
        getHeight()== container.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}
