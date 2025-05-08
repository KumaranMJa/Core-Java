import java.util.InputMismatchException;
import java.util.Scanner;

class Alpha{
    void fun1(){
        System.out.println("Connection Established 3: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerstor :");
        int a = sc.nextInt();
        System.out.println("Enter a denomenator ");
        int b = sc.nextInt();
        int c = a/b ;
        System.out.println(c);
        System.out.println("Connection Terminated 1 :");
    }
}
class Beta{
    void fun2(){
        System.out.println("Connection Established 2 :");
        Alpha a = new Alpha();
        a.fun1();
        /*try{ 
        a.fun1();
        }
        catch(ArithmeticException x){
            System.out.println("Enter a non zero or negative value");
        }
        catch(InputMismatchException i){
            System.out.println("Input should be an Integer");
        }
        catch (Exception e){
            System.out.println("Problem in program");
        }*/
        System.out.println("Connection Terminated 2 : ");
    }
}
class Gama{
    void fun3(){
        System.out.println("Connection Established 1 :");
        Beta a = new Beta();
        try{
            a.fun2();
        }
        catch(ArithmeticException x){
            System.out.println("Enter a non zero or negative value");
        }
        catch(InputMismatchException i){
            System.out.println("Input should be an Integer");
        }
        catch (Exception e){
            System.out.println("Problem in program");
        }
        System.out.println("Connection Terminated 3  :");
    }
}
public class ExcepHand3 {
    public static void main(String[] args) {
        Gama a = new Gama();
        a.fun3();
    } 
}
//Here in this code , the try catch block giving in fun1 method is the best way
//Bcoz there is where the excepption occuring. But here tried try catch in caller method for understanding.