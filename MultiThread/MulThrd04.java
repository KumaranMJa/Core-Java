class Demo10{
    static  int count;
    public synchronized void increment(){  //synchronized keyword allows only one thread at a time to access the resource till it terminates.
        count++;
    }
}
public class MulThrd04 {
    public static void main(String[] args){
        Demo10 d = new Demo10();
    Runnable obj1 = () -> {
        for(int i=1 ; i<=1000 ; i++){
            d.increment();
        }
    };
    Runnable obj2 = () -> {
        for(int i=1 ; i<=1000 ; i++){
            d.increment();
        }
    };
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();
    try {
        t1.join(); //join() method makes the caller(main) thread to wait and joins this thread after termination
        t2.join(); //join() is a checked exception , so using in try catch block
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println(Demo10.count);
    }
}
//works well in online compiler  issue on visual studio code
// Thread States : 
// New --(start)--> Runnable --(run()) --> Running --(sleep(),wait()) --> Waiting --> Dead
//waiting --(notify())--> Runnable , Runnable , Running --(stop())--> Dead
