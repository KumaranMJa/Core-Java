import java.util.ArrayList;
import java.util.Iterator;
//ArrayList
public class Collect1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(120);
        al.add(120);
        al.add(40);
        al.add(50);
        al.add("Tap");
        al.add(null);
        al.add(5.5);
        System.out.println(al);
        al.add(2,200); //compiler problem , it will exatcly place into 2nd class.
        al.add(1,1000);
        System.out.println(al);
        System.out.println(al.get(2)); //compiler problem , 200 is the one it will get
        ArrayList al2 = new ArrayList();
        al2.add(null);
        al2.add(550);
        al2.add("TapAcadamy");
        al2.add(null);
        al2.add(5.655);
        //al.addAll(al2);
        al.addAll(3, al2);
        System.out.println(al);
        al.removeAll(al2);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        System.out.println(al.size());
        al.set(6,6.6); //it deletes the 6th index and replaces it with the value inserted.
        System.out.println(al.get(6));
        System.out.println(al.contains("Tap")); // it returns true or false whether the value/object/collection contains in the arraylist.
        System.out.println(al.contains(al2));
        System.out.println(al.isEmpty());//it returns true or false whether the arraylist is empty or not
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
//Data Structure - Dynamic ArrayList ( index based)
//Default Capacity 10 , capacity increase = old capacity * 3 / 2  + 1