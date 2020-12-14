package com.mycompany.hw1;

public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        if (v1 == null || v2 == null || v3 == null) {
            throw new NullPointerException();
        }
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ']';
    }


    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }


    public String getType() {

        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);

        //System.out.println(a + " " + b + " " + c);

        if (a == b + c || b == a + c || c == a + b) {
            return Type.fourthType.getType();
        }
        else if (a == b && b == c) {
            return Type.firstType.getType();
        }
        else if (a == b || b == c || a == c) {
            return Type.secondType.getType();
        }
        else {
            return Type.thirdType.getType();
        }
    }
}
