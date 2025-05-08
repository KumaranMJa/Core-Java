//Custom Exception
class CustException extends Exception{ //creating our own exception , the class should extend Exception
    public CustException(String string){ //getting the message as, string parameter
        super(string); // pass the message to parent constructor , to get the message
    }
}
public class ExcHand04 {
    public static void main(String[] args) {
        int i=10;
        int j= 10;
        try {
            int x = i/j; 
            if(x==1){
                throw new CustException("THe ourput should not be one");
            }
        } 
        catch (CustException e) {
            System.out.println(e.getMessage());
        }
    }
}
