import java.util.Scanner;

public class ExcepHand1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Connection Established");
       try{ 
       System.out.println("Numerator :");
       int a = sc.nextInt(); //100 or 10 or 5 or 9
       System.out.println("Denominator");
       int b = sc.nextInt(); // 0
       int c = a/b; // It becomes error while execution , So it is a Exception
       System.out.println(c); 
       }
       catch(Exception e){
        System.out.println("Give a bon zero denominator");
       }
       System.out.println("Connection Terminated"); //Abrupt Terminaton due to Exception. So it is not printed.
    }
}
//Syntax error (grammatical mistake of java) it is on a compile time.