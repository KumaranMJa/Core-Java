//Static 
class Test{
    static int a , b;
    static 
    {
        System.out.println("Static Block");
        a=10;
        b=20;
    }
    static void  fun1(){
        System.out.println("Static Method");
    }
    int x,y;
    {
        System.out.println("Instance Block");
    }
    void fun2(){
        System.out.println("Instance Method");
    }
    Test(){
        System.out.println("Constructor");
        x=100;
        y=90;
    }
}
public class Stat {
    public static void main(String[] args) {
        Test.fun1();
        Test t = new Test();
        t.fun2();
    }
}
// Instance --> object , static --> no need of object
//class loader loads the class for the JVM to create the object of the 
// new className --> creates object[1] ,  (space)--> instance block[2], () --> constructor[3]
//static variables which is ot inside any method stores in memory area (static segement)
//Java is ROBUST , bcoz is uses optimizes memory management , as the stack cleares(FILO)& heap memory (garbage collector)
//... empty atlast again.

//static variables can be accessed by anyone(both static &  instatnce)
//instance variable can be accessed only by instance , not by static

//when a program is compiled JRE looks for - [1]static variables,[2]static block, [3]main method