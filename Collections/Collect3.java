//Array Dequeue
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Collect3 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque(); //initial capacity 16 fo Array Dequeue
        ad.add(10);
        ad.add(50.0);
        ad.add("Hi");
        ad.add(10);
        ad.add(30);
        ad.addFirst(100);
        //ad.add(null); It cannot store null - Run time exception
        System.out.println(ad);
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        ArrayDeque ad2 = new ArrayDeque(al);
        System.out.println(ad2);
        ad2.addAll(ad);
        System.out.println(ad2);
        System.out.println(ad2.peek());
        System.out.println(ad2.offerFirst(200));
        Iterator itr = ad2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Object e : ad2){
            System.out.println(e);
        }
        ad2.push(1000);
        ad2.push(3000);
        ad2.push(5000);
        System.out.println(ad2);
        System.out.println(ad2.pop());
        System.out.println(ad2);
    } 
}
//Collections stores as objects
//It can store Heterogenous data
//It stores duplicates
//it cannot store null
//it precerves the order of insertion
//DataStructure -(Double Ended Queue) In Dequeue the data can insert in front end and also rear end
//Constructors - 3 Constructors -> ArrayDequeue() , ArrayDequeue(int) ->(int is capacity we set) ,  ArrayDequeue(Collection).
//New Capacity = Old Capacity * 2 
//Hierarchy 
//array dequeue dont have any indexes.
//it dont have add( , ) method bcoz it dont have index
//Methods - add() , addFirst() , addLast() , addAll() , getFirst(), getLast(), offer, offerFirst, offerLast, removeFirst, removeLast, peek , pop
//Accessing -  for each  , Iterator , descendingIterator  . (cant access by for loop , list iterator)
//descendingIterator (it moves only backward so ut has hasNext , Next).
//When to use -if u have to build Queue(FIFO) and Stack(FILO), then use Array Dequeue.
//To use Dequeue as Stack - push() , pop()