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
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(place + i, element);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(place + i, element);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + estimatedTime);
    }

    public void compareAddListBeginning(String element) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, element);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, element);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + estimatedTime);
    }

    public void compareAddListEnd(String element) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(size - 1, element);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(size - 1, element);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + estimatedTime);
    }

    public void compareRemoveList(int place) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(place - i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(place - i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + estimatedTime);
    }

    public void compareRemoveListBeginning() {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + estimatedTime);
    }

    public void compareRemoveListEnd() {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(size - 1);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(size - 1);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList: " + estimatedTime);
    }



    public void compareAddSet(String element) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(element + i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(element + i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.add(element + i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet: " + estimatedTime);
    }

    public void compareContainsSet(String element) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.contains(element + (size / 1000));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.contains(element + (size / 1000));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.contains(element + (size / 1000));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet: " + estimatedTime);
    }

    public void compareRemoveSet(String element) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.remove(element + (size / 1000));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.remove(element + (size / 1000));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.remove(element + (size / 1000));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet: " + estimatedTime);
    }

    public void comparePutMap(Integer key, String value) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.put(key + i, value + i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put(key + i, value + i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.put(key + i, value + i);
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap: " + estimatedTime);
    }

    public void compareGetMap(Integer key) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.get(key + (100 * i));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.get(key + (100 * i));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.get(key + (100 * i));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap: " + estimatedTime);
    }

    public void compareRemoveMap(Integer key) {
        long startTime;
        long estimatedTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.remove(key + (100 * i));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.remove(key + (100 * i));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.remove(key + (100 * i));
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap: " + estimatedTime);
    }
}
