import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinHasMap {
     public static void main(String[] args) {
        LinkedHashMap hm = new LinkedHashMap();
        hm.put(1,"Kumaran"); //it adds the key value to the object
        hm.put(2,"Kumaran");
        hm.put(3,"Srinithi");
        hm.put(4,"TamilSelvi");
        hm.put(5,"Shivan");
        hm.put(null,"Murugar");
        hm.put(6,null);
        System.out.println(hm);
        System.out.println(hm.get(1));
        hm.remove(1);
        System.out.println(hm);
        System.out.println(hm.containsKey(null));
        System.out.println(hm.containsValue(7));
        System.out.println(hm.isEmpty());

        //To access key and value using iterator indirectly by using Set
        Set s = hm.entrySet(); //it converts all entry(key=value) to sets
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Accessing only key
        Set s2 = hm.keySet(); //it converts key to sets
        Iterator itr2 = s2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        //Accessing only values
        //Set s3 = hm.values(); //it converts values to sets , it needs type casting as Map values can store duplicates but Set cannot
        Iterator itr3 = hm.values().iterator(); // hm.values() -> it returns a collection which has only values which can be iterate
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
        System.out.println(hm.values());
        //Using for each loop , by accessing key we can get key and its value using get method
        for(Object x : hm.keySet() ){
            System.out.println("Key : "+x+" Value : "+hm.get(x));
        }
    }
}
//All are same as the hashmap but linked hash map preserves the order of insertion