package com.mycompany.HorstmannTasks.InheritReflect;

import com.mycompany.hw1.circle.Circle;

public class Main {

    public static void main(String[] args) {

        Point point = new Point(5,6);
        LabeledPoint labeledPoint = new LabeledPoint("myPoint",5,6);

        System.out.println(point.toString());
        System.out.println(labeledPoint.toString());
        System.out.println(labeledPoint.getLabel());

        System.out.println(labeledPoint.x);
        //System.out.println(Point.x);  ex3




    }

}
