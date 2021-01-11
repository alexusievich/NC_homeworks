package com.mycompany.HorstmannTasks.FundProgrStruct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex8 {
    private String str;

    public Ex8(String str) {
        this.str = str;
    }

    public void substr() {
        String[] array = str.split(" +");
        for (String word: array) {
            System.out.println(word);
            }
        }
    }

