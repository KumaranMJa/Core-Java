//Collections is a utility class of collection interfaces

import java.util.ArrayList;
import java.util.Collections;

public class Collect {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(20);
        al.add(300);
        al.add(100);
        System.out.println(Collections.min(al)); //cannot compare if values are of different class objects(data types)
        System.out.println(Collections.max(al));
        System.out.println(Collections.frequency(al, 100));
        System.out.println(Collections.replaceAll(al, 100, 10));
        Collections.sort(al);
        System.out.println(al);
    }
}
