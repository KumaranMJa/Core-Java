import java.util.InputMismatchException;
import java.util.Scanner;
public class ExcepHand2 {
    public static void main(String[] args) {
        System.out.println("Connection Establishment :");
        try{
            Scanner sc = new Scanner(System.in);
            //division :
            System.out.println("Enter the numerator");
            int a = sc.nextInt();
            System.out.println("Enter the denominator");
            int b = sc.nextInt();
            int c = a/b;
            //Array :
            System.out.println(c);
            System.out.println("Enter the size :");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the data to insert in array :");
            int  x = sc.nextInt();
            System.out.println("Enter the Index :");
            int i = sc.nextInt();
            arr[i]=x;
            System.out.println(arr[i]);
        }
        catch(ArithmeticException a){
            System.out.println("Give a non zero");
        }
        catch(NegativeArraySizeException b){
            System.out.println("Index cannor be neagtive");
        }
        catch(InputMismatchException c){
            System.out.println("Give Int Input");
        }
        catch(ArrayIndexOutOfBoundsException d){
            System.out.println("Be inn the limit");
        }
        catch(Exception e){ //this is a generic exception, it should be atlast bcoz only one catch will be functioned and others will be left out
            System.out.println("Problem"); 
        }
        System.out.println("Connectoin Terminated :");
    }
}
//A try can have multiple catche methods but only one works,
//others will left out , so generic exception should given atLast.
//where exception is occuring we should give try catch on that particular code
//we can have the exception on caller method(method calling rom differnt class) but it is not an efficient way.