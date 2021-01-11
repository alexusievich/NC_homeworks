package com.mycompany.HorstmannTasks.InterfLambdaExpr;

public interface Measurable {

    String getName();

    double getMeasure();

    double average(Measurable[] objects);

    Measurable largest(Measurable[] objects);

}
