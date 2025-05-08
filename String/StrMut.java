public class StrMut {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //Default capacity 16
        System.out.println(sb.capacity());
        sb.append("Java ");
        sb.append("JavaScript ");
        sb.append("Python");
        System.out.println(sb);
        System.out.println(sb.capacity());//here 16(default capacity) * 2 + 2   (bcoz the capacity need to increased for appending the string)
        sb.delete(0, 4); //0 - including , 4 - excluding
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer("Kumaran");
        System.out.println(sb2); 
        String s  = " Sri";
        sb2.append(s);
        System.out.println(sb2);
        System.out.println(sb.equals(sb2));
        String s2 = sb2.toString(); //converting StringBuilder to  String
        System.out.println(s2.toUpperCase());
        
    }
}
//StringBuilder(JDK 1.5) is more efficient than StringBuffer(JDK 1.0)
//String Builder does ot have toLowerCase , toUpperCase , split methods
//So convert it to Sttring and do the operations.