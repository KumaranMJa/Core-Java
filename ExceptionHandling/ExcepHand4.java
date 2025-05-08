
//finally and rethrowing the exceptpion
import java.util.Scanner;
class Alp{
    void fun1() throws Exception {
        Scanner sc = null; //local variable should be 
        System.out.println("Connection Established in fun : ");
        try{
        sc = new Scanner(System.in);
        System.out.println("Enter a numerstor :");
        int a = sc.nextInt();
        System.out.println("Enter a denomenator ");
        int b = sc.nextInt();
        int c = a/b ;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Please enter greater than zero");
            throw e; //Rethrowing the exception to the caller , here the caller is main method
        }
        finally{ //it will run even after the exception
            System.out.println("Connection Terminated in fun :");
            sc.close(); //Whatever happens scanner should be closed even after exception, so it is given in finally.
        }

    }
}
public class ExcepHand4 {
    public static void main(String[] args) {
        System.out.println("Connection Established in main");
        try{
            Alp al = new Alp();
            al.fun1();
        }
        catch(Exception e){
            System.out.println("Handled the Exception in main");
        }
        System.out.println("Connection Terminated in main");
    }
}
