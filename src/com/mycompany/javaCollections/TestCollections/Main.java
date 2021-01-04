package com.mycompany.javaCollections.TestCollections;

public class Main {
    public static void main(String[] args) {
        String str = "aaa";
        int size = 100000;
        Test test = new Test(size);
        System.out.println("Add for the ArrayList and LinkedList:");
        System.out.println("Beginning:");
        test.compareAddListBeginning(str);
        System.out.println("Middle:");
        test.compareAddList(str, 50000);
        System.out.println("End:");
        test.compareAddListEnd(str);
        System.out.println();
        System.out.println("Remove for the ArrayList and LinkedList:");
        System.out.println("Beginning:");
        test.compareRemoveListBeginning();
        System.out.println("Middle:");
        test.compareRemoveList(50000);
        System.out.println("End:");
        test.compareRemoveListEnd();
        System.out.println();
        System.out.println("Add for the HashSet, LinkedHashSet, TreeSet");
        test.compareAddSet(str);
        System.out.println("Contains for the HashSet, LinkedHashSet, TreeSet");
        test.compareContainsSet(str);
        System.out.println("Remove for the HashSet, LinkedHashSet, TreeSet");
        test.compareRemoveSet(str);
        System.out.println();
        System.out.println("Put for the HashMap, LinkedHashMap, TreeMap");
        test.comparePutMap(1,str);
        System.out.println("Get for the HashMap, LinkedHashMap, TreeMap");
        test.compareGetMap(1);
        System.out.println("Put for the HashMap, LinkedHashMap, TreeMap");
        test.compareRemoveMap(1);

    }
}
