package com.mycompany.HorstmannTasks.FundProgrStruct;

public class Ex10 {
    private double a;
    private long aa;
    private String b;
    public void print() {
        a = Math.random()*Long.MAX_VALUE;
        aa = (long) a;
        b = Long.toString(aa,36);
        System.out.println("Random string: " + b);
    }
}
