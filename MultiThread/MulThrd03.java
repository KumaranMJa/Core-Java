/*class A1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class B2 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}*/
public class MulThrd03 {
    public static void main(String[] args) {
        //Runnable obj1 = new A1(); //Polymorphism is achieved , Parent(Interface) Reference , child class Object
        //Runnable obj2 = new B2(); //loose coupling
        Runnable obj1 = new Runnable(){ //Annonymus Class
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable obj2 = () -> { //Lambda Expression ,Runnable Interface is a Functional Interface
            for(int i=0;i<10;i++){
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1); //Thread has a constructur to pass Runnable class
        Thread t2 = new Thread(obj2);
        t1.run();
        t2.run();
    }
}
//Why we use Runnable(interface) over Thread because  class cannot extend to more than one parent class , so if we extend..
//..Thread class , we cannot extend ant other class if we needed.
//If a class want to exetend some other class and a Thread(Multiple inheritence) it is not possible
//So class could implements Runnable and also can extend a Parent class when its needed
// Even Thread extends the Runnable Interface (it is a functional interface it has only one abstract method run())