package com.mycompany.HorstmannTasks.InterfLambdaExpr;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Measurable {


    private double salary;
    private String name;

    public Employee() {
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }


    @Override
    public double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable people : objects) {
            sum += people.getMeasure();
        }
        return sum / objects.length;
    }

    public String getName() {
        return name;
    }

    @Override
    public Measurable largest(Measurable[] objects) {
        ArrayList<Double> salary = new ArrayList<>();
        for (Measurable people : objects) {
            salary.add(people.getMeasure());
        }
        double max = Collections.max(salary);
        Measurable best = null;
        for (Measurable people : objects) {
            if (people.getMeasure() == max) {
                best = people;
            }
        }
        return best;
    }

}
