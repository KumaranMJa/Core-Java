package Enum_meration;
enum Crypto{
    BTC(4000)/*Costructed is called while creating/calling this constatnt objects*/ , DOGE, ETH, XRP , TRX;
    private int rupees = 0;
    Crypto() {
        //System.out.println("An object is Created for Constatns and Constructed is Created");
    }
    Crypto(int rs){
        rupees = rs;
    }
    public int getRupees() {
        return rupees;
    }

    public void setRupees(int rupees) {
        this.rupees = rupees;
    }
    
}
public class Enum1 {
    public static void main(String[] args) {
        Crypto x = Crypto.BTC;
        System.out.println(x);
        System.out.println(x.getRupees());
    }
}
//Enum can implement interfaces but cannot extends class
//Variables are declared as enum or public static final
//ToString() method is overridden

//In Enum we can have variables and constructors