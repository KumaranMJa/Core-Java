public class ExcHand02 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int num[] = new int[5];
        String str = null;
        try {
            System.out.println(str.length());
            j=18/i;
            System.out.println(num[5]);
        } 
        catch(NullPointerException n){
            System.out.println("Array is null or empty");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero "+ e);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Be in your limit of array");
        }
        catch(Exception x){ //Parent class(Exception) should always given at last in multiple catch blocks
            System.out.println("Some Exception Handles "+x);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
//when there is a exception occurs on try block , it does not execute the below statements in try block..
//.. it will directly jump to catch block