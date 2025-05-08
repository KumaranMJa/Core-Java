//Constructor
class Customer{
    private int cId;
    private String name;
    private int age;
    //Constructor has same name as class and have no return type.
    public Customer(int cId , String name , int age){
        this.name = name;
        this.age = age;
        this.cId = cId;
    }
    //Constructor is a specialized setter method of java.
    public int getcId(){
        return cId;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    Customer(){
        cId = 1;
        name = "Tamil";
        age = 48;
    }
}
public class Const {
    public static void main(String[] args) {
        Customer c1 = new Customer(96, "Kumaran", 22);
        System.out.println(c1.getcId()+" "+c1.getname()+" "+c1.getage());
        //Customer c2 = new Customer();//we created a  constructor , so there is no zero parameter constructor created by JC.
        Customer c3 = new Customer();
        System.out.println(c3.getcId()+" "+c3.getname()+" "+c3.getage());
    }
}
//When we don't create any constructor - a default constructor is created by Java Compiler(JC).
//we can also create a zero parameter constructor.
//we can create multiple constructor.
//Types of constructor - 
// 1.Default Consstructor - (A zero parameterized constructor , but it is created by JC )
//2.Zero Parameterized Constructor - (Created by programmer)
//3.Parameterized Constructor - (Created by programmer)