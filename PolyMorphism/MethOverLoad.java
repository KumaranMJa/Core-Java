class Cal{
    //return type does not matter in Method Overloading
    void add(int a , char b){
        System.out.println("Int Char");
    }
    void add(byte a , char b){
        System.out.println("Byte Char");
    }
}

public class MethOverLoad {
    public static void main(String[] args) {
        Cal c = new Cal();
        byte x = 96;
        c.add(x,'S'); //byte is decalerd and called.
        c.add(10, 'A'); //by default it takes the number as integer(if it is real number then double).
        c.add('A','B'); //It will typecaste implicity
        main(10,20); //overloaded can have main method but it should have different input parametres 
    }
    public static void main(int a , int b){
        System.out.println(a+b);
    }
}

//Method Overloading See - Method Name , No. of parameters , Type of Parameters , It do Imlicit typecasting for parameters.
//Return Types does not comes under method overloading.
