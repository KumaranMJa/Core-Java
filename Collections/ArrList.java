import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
//ArrayList is a inbuilt class
public class ArrList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Kumaran");
        al.add(null);
        al.add(100);
        ArrayList al2 = new ArrayList();
        al2.add(2000);
        al2.add(3000);
        al2.add(4000);
        al2.add(5000);
        System.out.println(al);
        //al.addAll(al2);
        al.addAll(1,al2);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.contains(1000));
        al.remove(0);
        //al.retainAll(al2); it keeps only al2 , al values will be removed
        al.removeAll(al2);
        al.set(1, "Sri");
        System.out.println(al);
        System.out.println(al.isEmpty());
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        for(Object x : al){
            System.out.println(x);
        }
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator li = al.listIterator();
        while(li.hasPrevious()){
            System.out.println(1);
            System.out.println(li.previous());
        }
    }
}
//In collections everything stores Objects
//Default capacity of ArrayList is 10 , new Capacity = ( old_capacity * 3 / 2 ) + 1
//Difference between Array nad ArrayList 
// Fixed Memory - Dynamic memory
//Homogeneous - Heterogeneous
//Primitive data types and objects - Objects