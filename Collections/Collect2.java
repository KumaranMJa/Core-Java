//Linked List 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collect2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(40);
        ll.add("Tap");
        ll.add(null);
        System.out.println(ll);
        ArrayList al = new ArrayList();
        al.add(1000);
        al.add(2000);
        al.add(3000);
        LinkedList ll2 = new LinkedList(al);
        System.out.println(ll2);
        ll2.addFirst(10);
        ll2.addLast(1000);
        System.out.println(ll2);
        ll.addAll(ll2);
        System.out.println(ll);
        System.out.println(ll.peek()+" "+ll.poll()); //peek - copy and paste , poll - cut and paste
        ll.pollLast();
        ll.removeFirst();
        System.out.println(ll);
        for(int i=0 ; i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        System.out.println(ll2);
        ListIterator itr = ll2.listIterator();
        while(itr.hasPrevious()){
            System.out.println(itr.previous() +" ll2 ListIterator");
        }
        System.out.println(ll2.get(0));
    }
}
//Linked List - Dynamic memory Allocation , it does not have indexes.
//DS - Doubly linked List