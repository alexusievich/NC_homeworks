package com.mycompany.javaCollections.MyLinkedList;

import com.mycompany.hw1.circle.Circle;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {



        MyLinkedList<Node> list = new MyLinkedList<>(Node.class);

        Node<Integer> node6 = new Node<>(3);
        Node<Integer> node5 = new Node<>(6,node6);
        Node<Integer> node4 = new Node<>(9,node5);
        Node<Integer> node3 = new Node<>(7,node4);
        Node<Integer> node2 = new Node<>(5,node3);
        Node<Integer> node1 = new Node<>(1,node2);


        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);


        //System.out.println(list.iterator(3).hasNext());
        //System.out.println(list.iterator(3).next());

        //list.iterator(0).remove();



        //list.add(3, node6);
        //System.out.println(list.get(1));
        //System.out.println(list.indexOf(node2));

        //System.out.println(list.remove(4));
        //list.clear();
        //System.out.println(list.set(1,node6));

        //list.toArray();

        //System.out.println(list.toArray());

        //System.out.println(list.toString());

        System.out.println("Compare MyLinkedList and JavaLinkedList:");
        CompareLinkedLists compareLinkList = new CompareLinkedLists(10000);
        compareLinkList.compareList();


    }

}
