//Custom Exception

import java.util.Scanner;

class Atm{
    int pin=6009;
    int pCustomer;
    public void acceptInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin");
        pCustomer = sc.nextInt();
    }
    public void verifyPin(){
        String Res = pin == pCustomer ? "Collect your Money" : "Invalid Pin";
        System.out.println(Res);
    }
}
class Banking{
    void init(){
        Atm a = new Atm();
        a.acceptInput();
        a.verifyPin();
    }
}
public class ExcepHand7 {
    public static void main(String[] args) {
        Banking b = new Banking();
        b.init();
    }
}
