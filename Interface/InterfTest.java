interface Parent1{
    void disp100();
    /*default void printDisp(){
        System.out.println("Parent 1");
    }*/
}
interface Parent2{
    void disp100();
    /*default void printDisp(){
        System.out.println("Parent 2");
    }*/
}
class Child implements Parent1,Parent2{ //it will become error as it implements two default method of same signature of different interface
                                        //but the same signature for abstract method will not be an issue as it only have method name , no different
                                        //..method body , so there we can implement multiple inheritence.
    @override
    public void disp100(){
        System.out.println("Multiple Inheritence");
    }

}
public class InterfTest {
    public static void main(String[] args) {
        
    }
}
//Multiple inheritene is fully not compatible in java even in interface
// when the deafult methods of different interface have same method signature it both cannot be implement by a singel class