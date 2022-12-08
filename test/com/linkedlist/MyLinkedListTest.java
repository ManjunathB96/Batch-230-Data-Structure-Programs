package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedShouldBeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70); //ctrl+alt+v -> to create variable  MyFirstNode
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList myLinkedList= new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
}
