
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreMap {
    public static void main(String[] args) {
      TreeMap tm = new TreeMap(); 
      tm.put(4, "TamilSelvi");
      tm.put(5, "Murugar");
      tm.put(1, "Murugar");
      tm.put(2, "Kumaran");
      tm.put(3, "Srinithi");
      System.out.println(tm);
      //To access key and value using iterator indirectly by using Set
        Set s = tm.entrySet(); //it converts all entry(key=value) to sets
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Accessing only key
        Set s2 = tm.keySet(); //it converts key to sets
        Iterator itr2 = s2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        
        Iterator itr3 = tm.values().iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
        for(Object x : tm.keySet()){
            System.out.print(x);
            System.out.println("\t"+tm.get(x));
        }
        System.out.println(tm.isEmpty());
        tm.remove(5);
        System.out.println(tm);
        tm.put(5, "dummy");
        System.out.println(tm.containsKey(5));
        System.out.println(tm);
        System.out.println(tm.containsValue("Srinithi"));
        //tm.ceilingEntry(); //it returns the ceiling entry(key,value) or same entry of the key we pass in the method
        System.out.println(tm.ceilingEntry(1));
        System.out.println(tm.floorEntry(7));
    }
}
//Key is homogeneous and cannot store null and cannot store duplicates
//Value is heterogeneous and can store null and duplicates
//does not preserve the order of insertion] , it stores in sorted order
//DataStructure --> Balanced Binary Search Tree
//Constructors --> 4 