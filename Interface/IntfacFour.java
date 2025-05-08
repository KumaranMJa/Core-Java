@FunctionalInterface
interface Display{
    public abstract void disp(); //functional interface have only one abstract method and can have number of  default method and private method
    default void disp2(){ //default in interface can be a complete (or concrete method)
        System.out.println("Default Method");
    }
    private static void disp3(){
        System.out.println("Private method");
    }
}
public class IntfacFour {
    public static void main(String[] args) {
            Display d = new Display() // (Anonymus class) new (create a object of anonymous class) which implemnets Display and ';' at last of the enclosed anonymous class
            { //class can be inside a main method
            @Override
            public void disp(){
                System.out.println("Implenting method of Functional Interface");
            }
        };
        d.disp();
        d.disp2();
    }
}