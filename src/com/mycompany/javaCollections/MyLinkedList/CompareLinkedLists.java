package com.mycompany.javaCollections.MyLinkedList;
import java.util.LinkedList;

public class CompareLinkedLists {
    private int size;

    public CompareLinkedLists(int size) {
        this.size = size;
    }

    public void compareList() {
        MyLinkedList<String> myList = new MyLinkedList<>();
        LinkedList<String> javaList = new LinkedList<>();
        System.out.println("Add(E):");
        compareAdd(myList, javaList);
        System.out.println("Add(index,E):");
        compareAddInd(myList, javaList);
        System.out.println("IndexOf(E):");
        compareIndexOf(myList, javaList);
        System.out.println("Remove(index):");
        compareRemove(myList, javaList);
    }

    public void compareAdd(MyLinkedList<String> list1, LinkedList<String> list2) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list1.add("Element " + (i + 1));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My time: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list2.add("Element " + (i + 1));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Standard time: " + estimatedTime);
    }

    public void compareAddInd(MyLinkedList<String> list1, LinkedList<String> list2) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        list1.add(9000, "Chosen element");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My time: " + estimatedTime);

        startTime = System.nanoTime();
        list2.add(9000, "Chosen element");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Standard time: " + estimatedTime);
    }

    public void compareIndexOf(MyLinkedList<String> list1, LinkedList<String> list2) {
        int found;
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        found = list1.indexOf("Chosen element");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My time: " + estimatedTime);

        startTime = System.nanoTime();
        found = list2.indexOf("Chosen element");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Standard time: " + estimatedTime);
    }
    public void compareRemove(MyLinkedList<String> list1, LinkedList<String> list2) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            String removed = list1.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My time: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 1000; i <2000; i++) {
            String removed = list2.remove(i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Standard time: " + estimatedTime);
    }
}
