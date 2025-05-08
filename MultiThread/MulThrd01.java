class A extends Thread{
    public void run(){ //A class which extends Thread should have run() method to start thread
                    // run() method should be public
        for(int i=0;i<=6;i++){
            System.out.println("Hello");
        }
    }
}
class B extends Thread{
    public void run(){ //A class which extends Thread should have run() method to start thread
                    // run() method should be public
        for(int i=0;i<=6;i++){
            System.out.println("Hi");
        }
    }
}
public class MulThrd01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();//start() is A Thread method which executes run()
        b.start();
        //Here both threads executes parallel , and prints the startement(threads) by thread scheduler
    }
}
//A thread is a execution path of a task
//A program has multiple task which are executed by multiple threads assigned by JVM
// Thread executes on thread priority 