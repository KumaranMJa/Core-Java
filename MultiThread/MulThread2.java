import java.lang.Runnable;
import java.lang.Thread;
class Demo10 implements Runnable{ //for independent instructions to achieve multi threading
    @Override //run method from threads should overridden.
    public void run(){
        System.out.println("Multi Thread 1");

    }
}
class Demo20 implements Runnable{
    public void run(){
        System.out.println("Multi Thread 2");

    }
}
class Demo30 implements Runnable{
    public void run(){

        System.out.println("Multi Thread 3");
    }
}
public class MulThread2 {
    public static void main(String[] args) {
    Thread t =Thread.currentThread();//it gives the current working thread
    t.setName("Mava");
    t.setPriority(5);//priority cant be zero'0'
    System.out.println(t);//op - (Name of the thread, priority name , name of the processing thread)
    Demo10 a = new Demo10();
    Demo20 b = new Demo20();
    Demo30 c = new Demo30();  
    
    Thread t1 = new Thread(a); 
    //giving the implenting class as constructor for accessing the run method by indirectly on start method
    Thread t2 = new Thread(b);
    Thread t3 = new Thread(c);
    t3.setPriority(8);
    t2.setPriority(2);
    t1.setPriority(9);
    t1.start(); //t1 has the constructor as a , which has the run . so start method access the run
    t2.start();
    t3.start();
    }
}
//Runnable<> is a interfacae class whic has run()
//Thread class whic implements Runnable<>
//Ways to implement multi threading - 1.extending thread , 2. implementing runnable