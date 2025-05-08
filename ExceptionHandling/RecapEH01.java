
import java.util.Scanner;

//ReCAp - Handling the 
class Demo1001{
    static int c;
    void fun1(){
        System.out.println("Connection 2 is established");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            c = a/b;  // a/0 for exception
        } catch (Exception e) {
            System.out.println("Exception is Handled in fun1()");
            System.out.println(e.getMessage());
        }
        System.out.println("Connection 2 is terminated");
    }
}
public class RecapEH01 {
    public static void main(String[] args) {
        System.out.println("Connection 1 is established");
        Demo1001 d1 = new Demo1001();
        d1.fun1();
        System.out.println("Connection 1 is terminated");
    }
}
//Exception handled in fun1() in same block of exception occurred using try catch 