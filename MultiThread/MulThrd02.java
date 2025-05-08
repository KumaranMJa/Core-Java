class Demo1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(100); // sleep is a checked exceotion
            } catch (InterruptedException e) { //it is known execption where it can may occur Interrrupted exception
                e.printStackTrace();
            }
        }
    }
}
class Demo2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class MulThrd02 {
    public static void main(String[] args) {
        Demo1 ob1 = new Demo1();
        Demo2 ob2 = new Demo2();
        //System.out.println(ob1.getPriority()); //getPriority() is a thread method , which returns the priority value 
        //ob2.setPriority(Thread.MAX_PRIORITY); //setPriority() is to set the priority value of thread , threa priority ranges from 1 to 10
        // 1 is min_priority , 5 is default priority  , 10 is max_priority .. it is only to suggest the Thread Scheduler for thread execution
        ob1.start();
        /*try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        ob2.start();
        ob1.setPriority(Thread.MAX_PRIORITY);
        ob2.setPriority(10);
        System.out.println(ob1.getPriority());
        System.out.println(ob2.getPriority());
    }
}
