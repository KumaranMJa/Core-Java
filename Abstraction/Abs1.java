abstract  class Bird{
    Bird(){
        System.out.println("Abstrsct class Constructor");
    }
    abstract void eat();
    abstract  void fly();
}
abstract class Eagle extends Bird{ //if any of abstract method is not overriden , then the class should be abstract method
    @override
    public void fly(){
        System.out.println("Eagles fly Higher");
    }
}
class WhiteEagle extends Eagle{
    @override
    public void eat(){
        System.out.println("WhiteEagle Eats");
    }
}
class GoldenEagle extends Eagle{
    @override
    public  void eat(){
        System.out.println("Golden Eagle Eats");
    }
}
class Poly{
    void disp(Eagle e){
        e.fly();
        e.eat();
    }
}
public class Abs1 {
    public static void main(String[] args) {
        Eagle we = new WhiteEagle();
        Eagle ge = new GoldenEagle();
        Poly p1 = new Poly();
        p1.disp(we);
        p1.disp(ge);
    }
}
