public class Stat2 {
    static int x = 100; //1
    static{ //2
        System.out.println("JRE(OS) loads 2nd");
    }
    public static void main(String[] args) {// 3
        System.out.println("Mian methods loads 3rd");
    }
}
//JRE - sees 1st static variable, 2nd  static block , 3rd main method(static method)
