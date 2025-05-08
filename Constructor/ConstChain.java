//Local Chaining
class Tes{
    int x , y;
    Tes(){
        this("Pass");
        System.out.println("Zero Parametrizrd user initialised constructor");
    }
    Tes(int x , int y){
        this(); // this method should be given in first line of the method body
        this.x = x;
        this.y=y;
        System.out.println(x+"\n"+y);
    }
    Tes(String s){
        System.out.println(s);
    }
    void dis(){
        //this(); ---> this method can only used inside a constructor
        System.out.println("Dummy Method");
    }
}
public class ConstChain {
    public static void main(String[] args) {
        Tes x = new Tes(96,69);
    }
}
