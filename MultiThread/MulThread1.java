import java.lang.Thread;
//run method used to achieve multi threading
class Demo100 extends Thread{ //for independent instructions to achieve multi threading
    @Override //run method from threads should overridden.
    public void run(){
        System.out.println("Multi Thread 1");

    }
}
class Demo200 extends Thread{
    public void run(){
        System.out.println("Multi Thread 2");

    }
}
class Demo300 extends Thread{
    public void run(){

        System.out.println("Multi Thread 3");
    }
}
public class MulThread1 {
    public static void main(String[] args) {
     Demo100 a = new Demo100();
     Demo200 b = new Demo200();
     Demo300 c = new Demo300();  
     a.start();
     b.start();
     c.start();
    }
}
//Thread scheduler -  Threadscheduler asign task to JVM to execute main
//Dependent coding or dependent methods process are single thread
//To achieve Multi threading , independent instructions should be coded.
//run() - is a inbuilt method inside Thread class. It's to achieve multi threading.Method should be public
//Whenevr a class extends thread, A memory created in stack in the name of Thread-0, Thread-1 as the no.of class extends Thread.
//call start [method] - run() in the finals step of achieving multi threading
//Thread scheduler assign the task to JVM based on the time of the procees in order to save CPU time.