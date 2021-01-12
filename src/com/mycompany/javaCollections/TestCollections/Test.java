package com.mycompany.javaCollections.TestCollections;

import java.util.*;

public class Test {
    int size;

    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();
    HashSet<String> hashSet = new HashSet<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    TreeSet<String> treeSet = new TreeSet<>();
    HashMap<Integer, String> hashMap = new HashMap<>();
    LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
    TreeMap<Integer, String> treeMap = new TreeMap<>();

    //Добавление, вставка, удаление элементов - сравнить

    public Test(int size) {

        this.size = size;

        for (int i = 0; i < size; i++) {
            arrayList.add("aa" + i);
            linkedList.add("aa" + i);
            hashSet.add("aa" + i);
            linkedHashSet.add("aa" + i);
            treeSet.add("aa" + i);
            hashMap.put(i, "aa" + i);
            linkedHashMap.put(i, "aa" + i);
            treeMap.put(i, "aa" + i);
        }
    }

     public void compareAddList(String element, int place) {

        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(place + i, element);
        }
        printResults("ArrayList", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(place + i, element);
        }
        printResults("LinkedList", startTime);
    }

    public void compareAddListBeginning(String element) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(0, element);
        }
        printResults("ArrayList", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(0, element);
        }
        printResults("LinkedList", startTime);
    }

    public void compareAddListEnd(String element) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(size - 1, element);
        }
        printResults("ArrayList", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(size - 1, element);
        }
        printResults("LinkedList", startTime);
    }

    public void compareRemoveList(int place) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(place - i);
        }
        printResults("ArrayList", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(place - i);
        }
        printResults("LinkedList", startTime);
    }

    public void compareRemoveListBeginning() {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.remove(0);
        }
        printResults("ArrayList", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.remove(0);
        }
        printResults("LinkedList", startTime);
    }

    public void compareRemoveListEnd() {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.remove(size - 1);
        }
        printResults("ArrayList", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.remove(size - 1);
        }
        printResults("LinkedList", startTime);
    }



    public void compareAddSet(String element) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(element + i);
        }
        printResults("HashSet", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(element + i);
        }
        printResults("LinkedHashSet", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.add(element + i);
        }
        printResults("TreeSet", startTime);
    }

    public void compareContainsSet(String element) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.contains(element + (size / 1000));
        }
        printResults("HashSet", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.contains(element + (size / 1000));
        }
        printResults("LinkedHashSet", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.contains(element + (size / 1000));
        }
        printResults("TreeSet", startTime);
    }

    public void compareRemoveSet(String element) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.remove(element + (size / 1000));
        }
        printResults("HashSet", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.remove(element + (size / 1000));
        }
        printResults("LinkedHashSet", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.remove(element + (size / 1000));
        }
        printResults("TreeSet", startTime);
    }

    public void comparePutMap(Integer key, String value) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.put(key + i, value + i);
        }
        printResults("HashMap", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put(key + i, value + i);
        }
        printResults("LinkedHashMap", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.put(key + i, value + i);
        }
        printResults("TreeMap", startTime);
    }

    public void compareGetMap(Integer key) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.get(key + (100 * i));
        }
        printResults("HashMap", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.get(key + (100 * i));
        }
        printResults("LinkedHashMap", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.get(key + (100 * i));
        }
        printResults("TreeMap", startTime);
    }

    public void compareRemoveMap(Integer key) {
        long startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.remove(key + (100 * i));
        }
        printResults("HashMap", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.remove(key + (100 * i));
        }
        printResults("LinkedHashMap", startTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.remove(key + (100 * i));
        }
        printResults("TreeMap", startTime);
    }

    public void printResults(String name, long startTime) {
        long estimatedTime;
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(name + ": " + estimatedTime);
    }
}
