/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.*;

/**
 *
 * @author Producer
 */

public class LinkedListExample_extended {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");


        System.out.println("First state in my list: "+states.getFirst());
        System.out.println("5th state in my list: "+states.get(5));
        System.out.println("Is 'Colorado' state in my list: "+states.contains("Colorado")); //returns boolean
        System.out.println("Total states in my list: "+states.size());
        System.out.println("Insert null in my list possible?: "+states.offer(null));
        System.out.println("Insert 'FirstState' at beginning of list possible?: "+states.offerFirst("FirstState")); //returns boolean
        System.out.println("Insert 'NewState' at beginning of list possible?: "+states.offerLast("NewState")); //returns boolean


        System.out.println("Insert 'VeryFirst' state in my list..");
        states.addLast("VeryLast");
        System.out.println("Last state in my list: "+states.getLast());

        //System.out.println("Insert 'VeryFirst' state in my list: "+ states.addFirst("VeryFirst"));
        System.out.println("Insert 'VeryFirst' state in my list: ");
        states.addFirst("VeryFirst");

        //Print all states in the List.
        System.out.println();
        System.out.println("Output using Collection object (no method needed):");
        System.out.println(states);

        System.out.println();
        System.out.println("Output using Iterator:");
        Iterator iterator = states.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Output using ListIterator(start from tail):");
        ListIterator lIterator = states.listIterator(states.size()); // parameter states.size() specifies the pointer to end of List.
        while(lIterator.hasPrevious()) {
            System.out.println(lIterator.previous());
        }

        System.out.println();
        System.out.println("Output using DescendingIterator:");
        Iterator dIterator = states.descendingIterator();
        while(dIterator.hasNext())
        {
            System.out.println(dIterator.next());
        }

        /*NOTE: Output of both- using ListIterator & DescendingIterator is same, however the methods used to get elements is not same.
        ListIterator is specifically for Lists and hence has methods for bi-directional traversal- and support methods for both previous() & next().
        But, DescendingIterator - returns an iterator over the elements in the deque in reverse sequence. So Uni-directional from tail element. And has only methods like next(), hasNext() etc.
        */


        //List<Integer> intList = new ArrayList<>(1,2,3,4,5);
        Collection collection = Arrays.asList(1,2,3,4,5);
        System.out.println("Insert an Collection<Integer> in my list possible?: "+states.addAll(collection)); //returns boolean

        Collection alphabets = Arrays.asList('a','b','c','d','e');
        System.out.println("Insert an another Collection(of chars) in my list , at a particular position possible?: "+states.addAll(5,alphabets)); //returns boolean

        //Print all states in the List once again.
        System.out.println();
        System.out.println("Output using Collection object (no method needed):");
        System.out.println(states);

        //Note: contains() methods takes an Object of a class, and not a Collection amd hemce will return false.
        System.out.println("Is 'alphabets' Collection(of chars) present in my list: "+states.contains(alphabets)); //returns boolean

        //states.sort(); // need a comparator as param

        //states.indexOf(); // need to provide an Oject as param
        //states.lastIndexOf(); // need to provide an Oject as param

        // element() returns an Object - i.e the FIRST element.
        System.out.println("Output of states.element() returns Object: "+states.element());

        //Following methods also return Object respectively-
        System.out.println("Output of states.peek() returns Object: "+states.peek()); //returns an Object - i.e the FIRST element.
        System.out.println("Output of states.peekFirst() returns Object: "+states.peekFirst()); //returns an Object - i.e the FIRST element.
        System.out.println("Output of states.peekLast() returns Object: "+states.peekLast()); //returns an Object - i.e the LAST element.

        //Print all states in the List.
        System.out.println();
        System.out.println("Output after peek:");
        System.out.println(states);


        //NOTE: poll() - RETURNS and REMOVES the element that was PRESENT at the beginning of List creation.
        System.out.println("Output of states.poll() returns Object: "+states.poll());
        System.out.println("Output of states.pollFirst() returns Object: "+states.pollFirst());
        System.out.println("Output of states.pollLast() returns Object: "+states.pollLast()); //polls the LAST element added to the List.



        //NOTE: pop() - RETURNS and REMOVES USING FIFO i.e the element that was "ADDED at the beginning" of List creation will be REMOVED FIRST.
        System.out.println("Output of states.pop() returns Object: "+states.pop()); //returns the element added at the very beginning of List creation.


        //Print all states in the List FINALLY.
        System.out.println();
        System.out.println("Output using Collection FINALLY:");
        System.out.println(states);


        /*
        SUMMARY-
        peek(),peekFirst(),element() works same- i.e RETURNS the First element from Collection but DOESN'T REMOVE.
        poll(),pollFirst(), remove(),pop() works same- i.e REMOVES & RETURNS the First element from Collection.

        Also,
        peek() is used with STACKS(LIFO) & QUEUES(FIFO).
        push() and pop() is used for STACKS.
        remove() and poll() is used for QUEUES.
        [Difference between remove(), poll():
         remove() removes the top element in FIFO and returns an ERROR if Queue is empty.
         However poll() is  a new method that also removes the top element but it returns NULL if the Queue is empty.]

         */

    }


}


