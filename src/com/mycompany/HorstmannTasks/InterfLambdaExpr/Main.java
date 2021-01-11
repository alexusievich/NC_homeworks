package com.mycompany.HorstmannTasks.InterfLambdaExpr;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        Measurable[] people = new Measurable[size];

        for (int i = 0; i < size; i++) {
            people[i] = new Employee(1000 + Math.pow(-1,i)*1000*i,"Aa" + i);
        }

        Employee employee = new Employee();
        System.out.println(employee.average(people));
        System.out.println(employee.largest(people).getName());

    }

}
