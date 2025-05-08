
public class Str {

    public static void main(String[] args) {
        String str = new String("Raja Ram Mohan Roy");
        String[] arr = str.split(" "); // split stores the strings in array
        for (String s : arr) {
            System.out.println(s);
        }
        String S1 = "James Gosling";
        String S2 = "James Gosling";
        if (S1 == S2) {
            System.out.println("Same Reference");
        } else {
            System.out.println("Not a same reference");
        }
        String S3 = new String("James Gosling");
        if (S1 == S3) {
            System.out.println("Same Reference");
        } else {
            System.out.println("Not a same reference");
        }
        if (S1.equals(S3)) {
            System.out.println("Same Value");
        } else {
            System.out.println("Not a Same Value");
        }
        char c[] = { 'J', 'A', 'V', 'A' };
        String s = new String(c);
        System.out.println(s);
        String str1 = "Java";
        String str2 = "JAVA";
        System.out.println(str1.compareTo(str2)); // it compares the character , returns the value for first not eqaul..
                                                  // ..character as +ve to -ve , if all equal returns 0
        String str10 = "Kumaran";
        String str20 = "Sri";
        String str30 = "Kumaran " + " Sri";
        String str40 = str10 + str20;
        System.out.println(str30);
        System.out.println(str40);
        String a = "Raj Ram Mohan";
        // String ar[] = a.split(" ");
        // System.out.println(ar[0]+" ..to.. "+ar[ar.length-1]);
        System.out.println(a.length());
        System.out.println(a.contains("ram")); // sub sring we give should be continuosuly present in string we check or..
                                               // ..else it will return false
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.charAt(2));
        System.out.println(a.startsWith("Ra"));
        System.out.println(a.endsWith("han"));
        System.out.println(a.substring(4,7)); //begin-Inclusive , end - exclusive
        char ca[] = a.toCharArray();
        for(char x : ca){
            System.out.print(x+" ");
        }
        String str100 = "   TAP ACADAMY   ";
        System.out.println(str100.trim()); // .trim() method trim the empty spaces from both ends in string.
    }
}
// String is immutable string object