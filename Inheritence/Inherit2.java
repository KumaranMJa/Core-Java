//Constructor chaining using inheritence, chaining from one class to another class constructor
class Test1{
    int a,b;
    Test1(){
        a=100 ;
        b=200;
        System.out.println("Parent Class Constructor 1");
    }
    Test1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Parent Class Constructor 2");
    }
}
class Test2 extends Test1{
    int x,y;
    Test2(){
        //this(9,99); // as this()  is there super() cannot be executed by JVM
        x=300 ;
        y=400;
        System.out.println("Child Class Constructor 1");
    }
    Test2(int x,int y){
        //by default it will have super() method to execute by jvm
        super(1000,2000);
        this.x=x;
        this.y=y;
        System.out.println("Child Class Constructor 2");
    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class Inherit2 {
    public static void main(String[] args) {
        Test2 t = new Test2(); //by calling this extended class , by default there will be super() method executed by JVM in default
                               //.. but we can override it when we needed
        t.disp();                        
    }
}
//A Constructor can have only one either super() or this() , by default jvm execute super ,
//.. whether we give this() , super() will not be exeuted in the constructor method.