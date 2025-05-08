package LastTopic;
//In java every class we create extends Object by default by JVM
class Employee{ //it extends Object
    int id ;
    String name;
    public Employee(String name , int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){ //by default it returns the reference aaddress of the objects
        return id+"  "+name; //in string class only the toString() method is overrriden by default
    }
}
public class ToStr {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kumaran",96);
        System.out.println(e1);
    }
}
