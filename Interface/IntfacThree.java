interface Demo{
    default void personal(){
        details();
    }
    default void profession(){
        details();
    }
    private static void details(){ //if the private is given in interface it only helps within the interface it cant be access or called by any other class
        System.out.println("Kumaran");
        System.out.println("22");
    }
}
class Sample implements Demo{
    //interface's static method cannot be inherited to a class
}
public class IntfacThree {
    public static void main(String[] args) {
        Sample n = new Sample();
        //Demo.details();
        n.profession(); // If the interface should not get it , even while called then it should give private
    }
    
}
