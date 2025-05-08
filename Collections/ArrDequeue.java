import java.util.ArrayDeque;
import java.util.Iterator;
public class ArrDequeue {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(100);
        ad.add("Kumaran");
        ad.add(10);
        System.out.println(ad);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        ad.addFirst("Sri");
        ad.addLast("10000");
        System.out.println(ad);
        ad.removeLast();
        ad.offer("Hello"); //offer method is also to add objects/elements in array dequeue 
        ad.offerFirst("Hi");
        ad.offerLast("Bye");
        System.out.println(ad);
        ArrayDeque ad2 = new ArrayDeque();
        ad2.push("Jil");
        ad2.push("Jung");
        ad2.push("Juk");
        System.out.println(ad2.pop());
        ad.addAll(ad2);
        System.out.println(ad);
        Iterator di = ad.descendingIterator();
        while(di.hasNext()){
            System.out.println(di.next());
        }
    }
}
//DS - Double ended queue , where data can inserted in both ends(front and rear)
//Preserves the order of insertion
//Default capacity 16
//It does not have index
//To use Dequeue as Stack , use push() , pop() method
//Cannot store null
//cannit use for loop and list iterator
//Array Dequeue can use as Queue(FIFO) , and also as stack(FILO) bu using push() , pop()