
import java.util.Scanner;

//Ducking an Exception (throws)
class Demo1003{
    void fun1() throws Exception{
        System.out.println("Connection 2 is established");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;  // a/0 for exception , once the exception occurus below statement does not work , it ducks the exception here..
                     //.. and throws the exception to the caller method(main()) 
        System.out.println("Connection 2 is terminatec");
    }
}
public class RecapEH03 {
    public static void main(String[] args) {
        System.err.println("Connection 1 is established");
        try {
            Demo1003 d1 = new Demo1003();
            d1.fun1();
        } catch (Exception e) {
            System.out.println("Exception Handled in main()");
        }
        System.out.println("Connection 2 is terminated");
    }
}
//here the exception method ducks the exception and throws the method to the main() using throws keyword
// main() handles the exception