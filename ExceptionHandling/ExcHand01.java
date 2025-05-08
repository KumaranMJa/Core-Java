public class ExcHand01 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{ 
        j=18/i; //Exception
        }
        catch(Exception e){ //Exception has a class , it is a object here
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
//RunTime Error is known as Exception Handling
//t will abroptly stop the execution of the program