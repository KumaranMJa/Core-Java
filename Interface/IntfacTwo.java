interface Calculator1{
     void ad(); // By default  in interface the methods are abstract and public
     void sub();
}
interface Calculator2{
    void mu();
    void div();
}

//Multiple inheritence is indirectly achieved through interface.

//Here two super class and one base class where that implenting two interfaces.

abstract class MyCalc1 implements Calculator1 , Calculator2{
 @Override
 public void ad(){
    System.out.println("Adding : ");
 }
 //partially implented methods should have the class as abstract
 @Override
 public void mu(){
    System.out.println("Multiplication : ");
 }
}
class De extends MyCalc1{
    @override
    public void sub(){
        System.out.println("Sub:");
    }
    @override
    public void div(){
        System.out.println("Div:");
    }
}
class Pol{
    void disp(MyCalc1 c){
        c.ad();
        c.mu();
        c.div();
        c.sub();
    }
}
public class IntfacTwo {
    public static void main(String[] args) {
        De d = new De();
        Pol p = new Pol();
        d.ad();
        d.mu();
        d.div();
        d.sub();
        p.disp(d);
    }
}
//the program works on online compiler , it is fault on vs code.