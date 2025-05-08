import java.util.HashSet;
import java.util.Iterator;
public class HasSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(null);
        hs.add("Kumaran");
        hs.add(1); //cannot store duplicates
        System.out.println(hs);
        //System.out.println(hs.);
        //hs.clear(); , it clears all the value in hs
        hs.remove(null);//it removes the value we mentioned in hs
        //hs.addAll(hs1); 
        //hs.removeAll(hs1);
        System.err.println(hs.contains(1));
        System.out.println(hs);
        for(Object o : hs){
            System.out.println(o);
        }
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//can store heterogeneous data
//cannot store duplicates
//can store null
//can access through for each loop and iterator only
//it stores the data based on address by hash function , not by indexes
//hashing --> data structure = hash table , algorithm = hash function
