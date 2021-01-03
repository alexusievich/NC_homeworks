package com.mycompany.javaCollections.MyLinkedList;

import java.util.Iterator;

public interface IMyLinkedListIterator<E> extends Iterator<E> {

     boolean hasNext();

     public E next();

     public void remove();

}
