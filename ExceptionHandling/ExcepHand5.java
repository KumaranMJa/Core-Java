//Ducking(Escaping)the Exception
import java.util.Scanner;

class Exc{
    void m1() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println(c);
        System.out.println("Terminated :");
        sc.close();
    }
}

public class ExcepHand5 {
    public static void main(String[] args) throws Exception  {
        try{
            Exc ex = new Exc();
            ex.m1();
        }
        catch(Exception e){
            System.out.println("An Exception ducked by Exc Class");
            throw e;
            //System.out.println("Hello"); //Code under throw will not be excecute.
        }
    }
    
}
//throw : 
//Rethrowing the exception
//Used in the body oof the method
//code below the throw will not be excectute

//throws :
//ducking an exception
//used in the signature(method name) of the method
//lines below the throws will excecute.