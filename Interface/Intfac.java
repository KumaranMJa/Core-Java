import java.util.Scanner;
interface Calculator{
    abstract public void add(); //interface is under abstraction so the methods inside interface should only be in abstract method.
    void sub(); //by default the method in interface is public and abstract
    default void mod(){
        System.out.print("MOD"); //2014 JDK-8. Default methods can have method body only in interface. to support backward compatability.
        //default method can override in implementing class 
        //But the default keyword can be only used in interface not in class and in override the default sholud be public in access modifiers
    }
    static void div(){ //In interface static method cant inherit to a class.
        //But in class static method can inherit to another class But cant be overriden.
        System.out.println("Division");

    }
}
class MyCalc1 implements Calculator { //interface class can be  only be implemented . the implements class called as implenting class
    @Override
    public void add(){ // the method name should be same as the interfacae class. abstract methods should be overrriden.
        int a =10;
        int b=20;
        System.out.println(a+b);
    }
    @Override
    public void sub(){
        int a = 20;
        int b = 10 ;
        System.out.println(a - b);
    }
    public void mul (){ //speacialised method
        int a = 10;
        int b = 20;
        System.out.println(a*b);
    }
}
class MyCalc2 implements Calculator{

    @Override
    public void add() {
        int x = 100;
        int y = 200;
        System.out.println(x+y);
        
    }

    @Override
    public void sub() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt() - scan.nextInt();
        System.out.println(x);
        scan.close();
        
    }  
}
class Pol{
    protected void disp(Calculator ref){
        ref.add();  //Upcasting . Parent ref with child class method
        ref.sub();
        ref.mod();
    }
}
public class Intfac {
    public static void main(String[] args){
        MyCalc1 c1 = new MyCalc1();
        MyCalc2 c2 = new MyCalc2();
        Pol t = new Pol();
        t.disp(c1);
        t.disp(c2);
        Calculator ref = c1;
        ((MyCalc1)(ref)).mul(); //Downcasting . Accessing spealised method with child class name & parent ref with speacilised method name.
        /*c1.add();
        Calculator ref = c2; //polymorphism - interface class ref ,implenting class obj
        ref.sub();*/
    }
    
}
