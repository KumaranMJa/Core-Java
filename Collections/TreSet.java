//TreeSet
import java.util.TreeSet;
public class TreSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(500);
        ts.add(300);
        ts.add(900);
        ts.add(700);
        System.out.println(ts);
        System.out.println(ts.ceiling(310));
        System.out.println(ts.floor(450));
        System.out.println(ts.higher(700));
        System.out.println(ts.lower(700));
        System.out.println(ts.tailSet(500));
        System.out.println(ts.headSet(700));
    }
}
//treeSet cannot store duplicates and also null
//It stores in sorted order
//It stores only homogeneous data