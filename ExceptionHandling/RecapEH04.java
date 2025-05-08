
import java.util.Scanner;

//Custom Exception , ATM cash collect , entering the details wrong for 3 times make card block.
class BankException extends Exception{
    public BankException(String message) {
        super(message);
    }
    //or
    /*@override
     * public String getMessage(){
     * return "Invalid car details"
     * }
     */
}
class ATM{
    private int accNo = 6666;
    private int pin = 9999;
    private int an;
    private int pw;
    void accpetInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Number");
        an = sc.nextInt();
        System.out.println("ENter the Password(Pin)");
        pw = sc.nextInt();
    }
    void validateInput() throws Exception{
        if(accNo==an && pin==pw){
            System.out.println("Collect your Money");
        }
        else{
            throw new BankException("Invalid User Details"); //ducking the exception and throwing it to caller method
        }
    }
}
class Bank{
    void initiate(){
        ATM a = new ATM();
        try { //1st time
            a.accpetInput();
            a.validateInput();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            try { //2nd time
                a.accpetInput();
                a.validateInput();
            } 
            catch (Exception f) 
            {
                System.out.println(f.getMessage());
                try { //3rd time
                    a.accpetInput();
                    a.validateInput();
                } catch (Exception x) {
                    System.out.println("Your card is Blocked");
                }
            }
        }
    }
}
public class RecapEH04 {
   public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.initiate();
   } 
}
//Working fine in online compiler , problem in vs code.
//here we use n number of nested try catch block , to "block the card" , if the user have given n number of invalid input