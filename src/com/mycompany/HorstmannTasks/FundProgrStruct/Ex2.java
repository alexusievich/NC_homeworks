package com.mycompany.HorstmannTasks.FundProgrStruct;

public class Ex2 {
    private int radian;

    public Ex2(int radian) {
        this.radian = radian;
    }

    public void convert() {
        double result1;
        double result2;
        result1 = (radian * 180 / Math.PI) % 360;
        result2 = Math.floorMod((int) (radian * 180 / Math.PI), 360);
        System.out.println("Degrees:");
        System.out.println("Using %: " + result1);
        System.out.println("Using floorMod: " + result2);
    }
}
