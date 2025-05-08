package LastTopic.Comparable;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    public Employee(int id,String name) {
        this.id = id;
        this.name = name;
    }
    @Override //abstract method of comparable class is overriden here
    public int compareTo(Employee e2){ //e2 is passed as input parameter
        Employee e1 = this; //e1 is passsed as instance object 
        int id1 = e1.id; //Employee e1 is passed as variable
        int id2 = e2.id;
        //return e1.compareTo(e2); //this is best way as compareTO goes to Integer class compare to to return value
        //manual code below :
        if(id1 > id2){
            return 1; //if positive swap 
        }
        else if(id1 < id2){
            return -1; //if negative no swap
        }
        else{
            return 0; //if 0 no swap
        }
    }
    @Override 
    public String toString(){
        return ""+id+" "+name+" ; ";
    }
}
public class Comparat {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        Employee e1 = new Employee(3,"Ac");
        Employee e2 = new Employee(2,"Xy");
        Employee e3 = new Employee(1,"Mn");
        al.add(e1);
        al.add(e2);
        al.add(e3);
        Collections.sort(al);
        System.out.println(al);
        
    }
}
//Correct program error in vs code , runs in online compiler