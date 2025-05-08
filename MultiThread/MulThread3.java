//Muti THreading using one run method.

import java.lang.Thread;
class Demo101 extends Thread{ //for independent instructions to achieve multi threading
    @Override //run method from threads should overridden.
    public void run(){
        Thread t = Thread.currentThread(); //Gets the current working thread
        String s = t.getName(); //s Stores the name of current working thread in String
        if(s.equals("Alik")){
            Alik();
        }
        else if(s.equals("Belik")){
            Belik();
        }
        else{
            Clik();
        }
    }
    public static void Alik(){
        System.out.println("Multi Thread 1");
    }
    public void Belik(){
        System.out.println("Multi Thread 2");

    }
    public void Clik(){
        System.out.println("Multi Thread 3");
    }
}
public class MulThread3 {
    public static void main(String[] args) {
    Thread t =Thread.currentThread();//it gives the current working thread
    t.setName("Mava");
    t.setPriority(5);
    System.out.println(t);
    Demo101 a = new Demo101();
    Demo101 b = new Demo101();
    Demo101 c = new Demo101(); 
    //These three objects create three thread memory in stack memory
    a.setName("Alik");
    b.setName("Belik");
    c.setName("Clik");
    //each thread has setted a name, and if the current thread has a thread name which will execute the particular method.
    a.start(); //t1 has the constructor as a , which has the run . so start method access the run
    b.start();
    c.start();
    }
}
//EXception in a thread, only that thread will be get terminated other threads will work.