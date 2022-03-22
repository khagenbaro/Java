package collection.java;

import java.util.LinkedList;

import java.util.ListIterator;

public class LinkedListTest {
    LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(23);
        linkedList.add(23);
        linkedList.add(23);
        ListIterator list_Iter = linkedList.listIterator(2);
        while (list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }

    }

}
