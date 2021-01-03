package com.mycompany.javaCollections.MyLinkedList;

import java.util.Objects;

public class Node <E> {
    private E element;
    private Node<E> nextNode;


    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> nextNode, Node<E> previousNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;

    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<E> node = (Node<E>) o;
        return Objects.equals(getElement(), node.getElement());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElement());
    }
}
