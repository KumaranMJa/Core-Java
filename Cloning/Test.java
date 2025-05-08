import java.util.Map;
import java.util.TreeMap;

class Test{
    public static void main(String[] args) {
        Map<Integer, String> lhm1 = new TreeMap<>();
        lhm1.put(2,null);
        lhm1.put(3,null);
        lhm1.put(4,"Kumaran");
        lhm1.put(1,"Kumaran");
        System.out.println(lhm1);

    }
}