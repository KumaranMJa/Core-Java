//TreeSet

import java.util.Iterator;
import java.util.TreeSet;

public class Collect4 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        /*ts.add("Ab");
        ts.add("Ab");
        ts.add("Xy");
        ts.add("Mn");
        ts.add("St");
        ts.add("Cd");*/
        /*ts.add(true);
        ts.add(false);
        ts.add(true);*/
        //ts.add(null); Null cant be stored in Treeset(Null pointer Exception)
        System.out.println(ts);
        System.out.println(ts.ceiling(95)); //ceiling gives the same value or else higher value present near the 95 in TreeSet.
        System.out.println(ts.higher(125)); //gives the next higher value in TreeSet
        System.out.println(ts.floor(125)); //gives the same value if present or else lower value
        System.out.println(ts.lower(125)); //it gives the next lower value from the value
        System.out.println(ts.headSet(150));//excluding the value, it gives the head part of treeset
        System.out.println(ts.tailSet(75)); //including the value it gives the tail part of treeset
        System.out.println(ts.subSet(75, 150));//from value included , to value excluded.
        Iterator itr=ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr1=ts.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
//TreeSet stores the data in sorted order.
//Data Structure - Tree like sttructure - smaller (left node) , higher (right Node). Starting data is initial node. [Balanced Binadry Tree]
//Traversal Mechanishm  of TreeSet - InOrder Traversal .
//TreeSet cant store heterogenous data, it stores homogenous data only.
// Duplicates cannot be stored
// Null cannot be stored
//It does not preserve the order of insertion, it preserves in sorted order
//Constructors - 5
//Hierarchy - 
//Methods - add(), ceiling() , higher(), floor(), lower(), headSet() , tailSet() , subSet()
//Accessing - for each loop , iterator , descendingIterator
//When to use - 
//When not to use - 
//If the given data is skewed tree(ex.10,120,140,150,1000), it uses red black tree algorithm and convert it to balance binary search tree