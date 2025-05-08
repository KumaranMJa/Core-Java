//Throw 
public class ExcHand03 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try {
            j=18/i;
            if(j==0){
                throw new ArithmeticException("Dont want an output as Zero"); //throwing an exception on our own with a message parameter
            }
        } catch (ArithmeticException e) {
            j=18/2;
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Some error occures "+ e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
