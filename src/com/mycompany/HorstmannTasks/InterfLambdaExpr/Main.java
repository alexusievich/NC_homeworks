package com.mycompany.HorstmannTasks.InterfLambdaExpr;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static com.mycompany.HorstmannTasks.InterfLambdaExpr.Ex10.runInOrder;
import static com.mycompany.HorstmannTasks.InterfLambdaExpr.Ex10.runTogether;

public class Main {

    public static void main(String[] args) {
//        int size = 10;
//        Measurable[] people = new Measurable[size];
//
//        for (int i = 0; i < size; i++) {
//            people[i] = new Employee(1000 + Math.pow(-1,i)*1000*i,"Aa" + i);
//        }
//
//        Employee employee = new Employee();
//        System.out.println(employee.average(people));
//        System.out.println(employee.largest(people).getName());

//        IntSequence seq = IntSequence.of(3, 1, 4, 1, 5, 6);
//        System.out.println(seq.hasNext());
//        System.out.println(seq.next());
//
//        IntSequence constant = IntSequence.constant(1);
//        System.out.println(constant.next());
//        System.out.println(constant.next());

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("ab");
//        arrayList.add("abc");
//        arrayList.add("a");
//
//        Ex8 ex8 = new Ex8();
//        ex8.luckySort(arrayList, (s1, s2) -> s1.length() - s2.length());
//        System.out.println(arrayList);

//        Greeter misha = new Greeter(3,"Michael");
//        Greeter alesha = new Greeter(4,"Alexey");
//
//        Thread threadMisha = new Thread(misha);
//        Thread threadAlesha = new Thread(alesha);
//
//        threadMisha.start();
//        threadAlesha.start();

//        Runnable runnable1 = () -> System.out.println("runnable1");
//        Runnable runnable2 = () -> System.out.println("runnable2");
//
//        runTogether(runnable1, runnable2);
//        runInOrder(runnable1, runnable2);

        Ex11 ex11 = new Ex11();
        System.out.println(Arrays.toString(ex11.ls(".")));
        System.out.println(Arrays.toString(ex11.lsMethodExpression(".")));
        System.out.println(Arrays.toString(ex11.lsAnonymousClass(".")));

        Ex12 ex12 = new Ex12();
        System.out.println(Arrays.toString(ex12.lsFilesOfExtension(".", "iml")));

        Ex13 ex13 = new Ex13();
        File[] files = new File(".").listFiles();
        ex13.sort(files);
        System.out.println(Arrays.toString(files));
    }

}
