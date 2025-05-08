
import java.util.Scanner;

//Re-Throwing the exception
class Demo1002{
    static int c;
    void fun1() throws Exception{
        System.out.println("Connection 2 is established");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            c = a/b;  // a/0 for exception
            if(a==0){
                throw new Exception(); //if a is 0 also , we throw the exception to catch block. 
            }
        } catch (Exception e) {
            System.out.println("Exception is Handled in fun1()");
            throw(e); //Statements below throw will not execute , so we have to use finally block.
        }
        finally{
            System.out.println("Connection 2 is terminated");
        }
    }
}
public class RecapEH02 {
    public static void main(String[] args) {
        System.out.println("Connection 1 is established");
        try {
            Demo1002 d1 = new Demo1002();
            d1.fun1();
        } catch (Exception e) {
            System.out.println("Exception is Handled in Main()");
        }
        System.out.println("Connection 1 is terminated");
    }
}
//Re-Throwing the exception(try - catch - throw - throws - finally )
//Exception is hadled in fun1() , before throwing exception to main() , it executes finally() and then it throws to main()
//And the exception is handled in main() too.
//Statements below throw will not execute , so we have to use finally block.