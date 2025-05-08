@FunctionalInterface
interface Show{
    void disp(int a , int b);
}
@FunctionalInterface //Error in vs code , it runs in online compiler 
interface Test{
    void dummy(int x);
}
public class IntfacLambda {
    public static void main(String[] args) {
        Show d = (a,b) -> { System.out.println(a+b); }; //Lambda Function - () [input parametres] -> [pointing towrds body] {} [body]
        d.disp(10 , 20);
        Test t = (x) -> {System.out.println(x);}; //it is running in online compiler , problem in vs code.
        t.dummy(96);
    }
}
/*
 * Lambda Epression
 * = (int a) -> { };
 * = (a) -> { };
 * = a -> { }; (for two or more number of parameters "( )" should be compulsory
 * All are correct lambda expression
 * Lambda is used for functional interface not for normal interface
 */
//We can use 0 to many(n) numner of functionalInterface in java , but the abstract method should have different signature.