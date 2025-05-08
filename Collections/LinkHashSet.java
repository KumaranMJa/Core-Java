
import java.util.Iterator;
import java.util.LinkedHashSet;

//All the properties are same as hashset but linked-hash-set preserves the order of insertion
class LinkHashSet{
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Kums");
        lhs.add("Kums"); //Duplicates will not be stored
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.getClass()); //it gets the class of lhs
        lhs.remove(null); //it removes null that present in lhs
        System.out.println(lhs);
        lhs.remove(null); //if it is present it will remove or else it will leave it
        System.out.println(lhs);
        lhs.add("Sri");
        lhs.add("TamilSelvi");
        lhs.add("JK");
        lhs.add("SK");
        lhs.add("DK");
        for(Object x : lhs){
            System.out.println(x);
        }
        Iterator itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}