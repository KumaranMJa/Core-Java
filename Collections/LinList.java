
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinList {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(100);
        ll1.add("Kumaran");
        ll1.add(null);
        ll1.addLast("Dummy");
        ll1.addFirst("Abc");
        ll1.set(3, "Sri");
        System.out.println(ll1);
        ArrayList al = new ArrayList();
        al.add(1000);
        al.add(200);
        al.add(3000);
        ll1.addAll(al);
        System.out.println(ll1);
        LinkedList ll2 = new LinkedList(ll1);
        ll2.add(5000);
        System.out.println(ll2);
        System.out.println(ll2.peek());//it just copy the first value
        System.out.println(ll2.pop());//it cuts the first value
        System.out.println(ll2);
        ll2.removeAll(ll1);
        System.out.println(ll2);
        for(int i=0;i<ll1.size();i++){
            System.out.println(ll1.get(i));
        }
        System.out.println("List Iterator below  : ");
        ListIterator li = ll1.listIterator();
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("End");
    }
}
//LinkedList uses Doubly Linked List Data Structure where a node has data , address of previous node and adddress of next node 
//It has same method as LinkedList
//LinkedList uses dynamic memory allocation
//pop and poll both will cut and paste the element
//if the collection is empty pop will throw NoSuchElementException and poll will return null
//In java collection LinkedList has indexes not directly vut internal order of elements , where each node has the references of previous..
//..and next node.