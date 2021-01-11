package com.mycompany.HorstmannTasks.FundProgrStruct;

import java.math.BigInteger;

public class Ex6 {
    private int n;

    public Ex6(int n) {
        this.n = n;
    }

    public void factorial() {
        BigInteger result = BigInteger.valueOf(1);
        BigInteger j = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++) {
            result = result.multiply(j);
            j = j.add(BigInteger.valueOf(1));
        }
        System.out.println(result);
    }

}
