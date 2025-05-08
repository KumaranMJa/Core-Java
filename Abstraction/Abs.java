abstract class Bird{ // abstract class can have abstaract method and normal method .
    abstract void eat();
      //abstract method should have only method signature , abstract method can only declare on abstract class
    abstract void fly();
    static  void testStatic(){ //static method can be created in abstract class
        System.out.println("Static method can be created in abstract class");
    }
}
abstract class Eagle extends Bird{ // if any  abstract method is not overriden then the child class should also decalre abstract.
    //when the child class is called first the super class will be read and the child classs methods will be called next.
    @Override
    void fly(){
        System.out.println("Eagles can fly");
    }
}
class WhiteEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("WhiteEagle eats");
    }
    @Override
    void fly(){
        System.out.println("WhiteEagle flew Low");
    }
}
class GoldenEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("GoldenEagle eats");
    }
    @Override
    void fly(){
        System.out.println("GoldenEagle flew Low");
    }
}

class FlyingAnimal{
    void dis(Bird ref){ //Parent class reference , with child class object
        ref.eat(); //upcasting ,loose coupling
        ref.fly(); //upcasting ,loose coupling
    }
}
public class Abs {
    public static void main(String[] args){
        //Cannot create object for abstract class
        //constructor can be creat for abstarct class with the help of extended child class constructor with the help of constructor chaining.
        WhiteEagle w = new WhiteEagle();
        GoldenEagle g = new GoldenEagle();
        FlyingAnimal f = new FlyingAnimal();
        //polymorphism is achieved in abstraction
        f.dis(w);
        f.dis(g);
        Eagle.testStatic(); //calling the static method in abstract class.
    }
}
//for specialized method of  child class..
//.. ((child_class Name)(parent_refernce)).specialized_method_name();   ---> downcasting 