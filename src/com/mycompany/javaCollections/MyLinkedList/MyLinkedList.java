package com.mycompany.javaCollections.MyLinkedList;

import java.lang.reflect.Array;
import java.util.*;

public class MyLinkedList<E> implements IMyLinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;


    @Override
    public void add(E element) {
        if (size == 0) {
            first = new Node<>(element);
            last = first;
            size = 1;
        } else {
            Node<E> node = new Node<>(element);
            last.setNextNode(node);
            last = node;
            size++;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("index > size");
        } else if ((index == 0 && size == 0) || (index == size)) {
            add(element);
        } else if (index == 0) {
            first = new Node<>(element, first);
            size++;
        } else {
            Node<E> cursor = first;
            for (int i = 0; i < index - 1; i++) {
                cursor = cursor.getNextNode();
            }
            Node<E> elem = new Node<>(element, cursor.getNextNode());
            cursor.setNextNode(elem);
            size++;
        }
    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.getNextNode();
            x.setElement(null);
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("The list is empty");
        }
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("index >= size");
        }
        Node<E> cursor = first;
        for (int i = 0; i < index; i++) {
            cursor = cursor.getNextNode();
            ;
        }
        return cursor.getElement();
    }

    @Override
    public int indexOf(E element) {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("The list is empty");
        }
        Node<E> cursor = first;
        int index = 0;
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (cursor.getElement().equals(element)) {
                check = true;
                return index;
            } else {
                cursor = cursor.getNextNode();
            }
            index++;
        }
        System.out.println("There is no required element in the list");
        return -1;
    }

    @Override
    public E remove(int index) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("index >= size");
        } else {

            Node<E> cursor = first;
            Node<E> next;

            if (index == 0) {
                first = cursor.getNextNode();
            } else {
                for (int i = 0; i < index - 1; i++) {
                    cursor = cursor.getNextNode();
                }
                next = cursor.getNextNode();
                cursor.setNextNode(next.getNextNode());
                cursor = next;

            }
            E result = cursor.getElement();
            cursor.setElement(null);
            next = null;
            size -= 1;
            return result;
        }
    }


    @Override
    public E set(int index, E element) {
        E oldVal = null;
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException("index >= size");
        } else {
            Node<E> cursor = first;
            for (int i = 0; i < index; i++) {
                cursor = cursor.getNextNode();
            }
            oldVal = cursor.getElement();
            cursor.setElement(element);
        }
        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.getNextNode())
            result[i++] = x.getElement();
        return (E[]) result;
    }

//    public E[] toArray2() {
//        E[] result = new E[size];
//        int i = 0;
//        for (Node<E> x = first; x != null; x = x.getNextNode())
//            result[i++] = x.getElement();
//        return result;
//    }
//
//
//    public E[] Array1(E[] a) {
//        if (a.length < size) {
//            E[] result = (E[]) Arrays.copyOf(elements, size, a.getClass());
//            return result;
//        }
//        System.arraycopy(elements, 0, a, 0, size);
//        if (a.length > size) {
//            a[size] = null;
//        }
//        return a;
//    }



    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator<E>(0);
    }

    public Iterator<E> iterator(int index) {
        return new MyLinkedListIterator<E>(index);
    }

    Node<E> getNode(int index) {
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return node;
    }

    public String toString() {
        String result = "";
        if (size == 0) {
            return "The list is empty";
        }
        Node<E> cursor = first;
        for (int i = 0; i < size; i++) {
            result += cursor.getElement() + ", ";
            cursor = cursor.getNextNode();
        }
        return "MyLinkedList = [ " + result.substring(0, result.length() - 2) + " ];";
    }


    private class MyLinkedListIterator<E> implements IMyLinkedListIterator<E> {


        private Node<E> element;
        private Node<E> nextElement;
        private int nextIndex;
        private int iteratorSize;


        public MyLinkedListIterator(int index) {
            iteratorSize = size;
            nextIndex = index;
            if (iteratorSize == 0) {
                nextElement = null;
            } else {
                nextElement = (Node<E>) getNode(index);
            }
        }


        public int getIteratorSize() {
            return iteratorSize;
        }

        public int getNextIndex() {
            return nextIndex;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < iteratorSize;
        }


        @Override
        public E next() {
            if (hasNext()) {
                element = nextElement;
                nextElement = nextElement.getNextNode();
                nextIndex++;
                return element.getElement();
            } else {
                throw new NoSuchElementException("The element doesn't has next");
            }
        }

        @Override
        public void remove() {
            if (nextIndex < iteratorSize) {
                Node<E> cursor = (Node<E>) first;
                iteratorSize -= 1;
                if (nextIndex == 0) {
                    MyLinkedList.this.remove(0);
                } else {
                    MyLinkedList.this.remove(nextIndex);
                }
            } else {
                throw new IndexOutOfBoundsException("The required element doesn't exist");
            }
        }

    }
}



