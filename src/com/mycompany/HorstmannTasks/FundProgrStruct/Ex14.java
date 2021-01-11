package com.mycompany.HorstmannTasks.FundProgrStruct;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {

    private ArrayList<int[]> array;

    public void readMatrix() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(!str.equals("")){
            String[] stringNumbers = str.split(" +");
            int length = stringNumbers.length;
            int[] numbersInt = new int[length];
            for (int i = 0; i < length; i++) {
                numbersInt[i] = Integer.parseInt(stringNumbers[i]);
            }
            arrayList.add(numbersInt);
            System.out.println("Enter the string: ");
            str = sc.nextLine();
        }
        System.out.println("The matrix: ");
        for (int[] ints : arrayList) {
            System.out.println(Arrays.toString(ints));
        }
        this.array = arrayList;
    }

    public boolean checkMagic(){
        for (int[] ints : array) {
            if (ints.length != array.size()) {
                System.out.println("The matrix is not square");
                return false;
            }
        }
        int sum = 0;
        int sumRows = 0;
        int sumColumns = 0;
        int mainDiagonal = 0;
        int sideDiagonal = 0;
        for (int[] ints : array) {
            sum += ints[0];
        }
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.get(i).length; j++) {
                sumRows += array.get(i)[j];
                sumColumns += array.get(j)[i];
            }
            if (sumColumns!=sum || sumRows!=sum)
                return false;
            sumColumns = 0;
            sumRows = 0;
            mainDiagonal += array.get(i)[i];
            sideDiagonal += array.get(array.size()-1-i)[array.size()-1-i];
        }
        return mainDiagonal == sum && sideDiagonal == sum;
    }
}







