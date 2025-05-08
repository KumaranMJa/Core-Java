import java.util.Scanner;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
class Employee implements Comparable<Employee> { // extends Object , it is hidden
    private int id;
    private String name;
    private int salary;
    private String email;
    public int setSalary;
    public String setName;
    public int setId;
    public String setEmail;
    public Employee(int id, String name, int salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @override
    public String toString() { // toString is a method in Object , it only returns the hash_code by default
                               // when..
                               // ..we call just the reference of the class
                               // But this toString() method is overridden by default in String class object
                               // only.
        return "Id:" + id + " name:" + name + " salary:" + salary + " email:" + email;
    }

    @Override
    public int compareTo(Employee o) { // in default it points first value and passes the second value as constructor and commpare with the first one, it..
                                       // returns -ve or 0 or +ve value. And it swaps according to that and it compares..
                                       // the nest two elements. if(-ve no swap , 0 no swap), if (+ve swap)
        // TODO Auto-generated method stub
        Employee e1 = this;
        Integer id1 = e1.id;
        Integer id2 = o.id;
        String email1 = e1.email;
        String email2 = o.email;
        if (id1.compareTo(id2) == 1) {
            return email1.compareTo(email2);
        }
        return id1.compareTo(id2);
    }
}
public class Comprator1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Kumaran", 50000, "kumaran360ftw@gmail.com");
        System.out.println(e1);
        TreeSet<Employee> ts = new TreeSet<Employee>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();// should given to enter a next String scanner value , if there is any other..
                        // ..scanner (input) before.
        for (int i = 1; i <= n; i++) {
            Employee e2 = new Employee();
            String details = scan.nextLine();
            String[] arr = details.split(",");
            e2.setId(Integer.parseInt(arr[0]));
            e2.setName(arr[1]);
            e2.setSalary(Integer.parseInt(arr[2]));
            e2.setEmail(arr[3]);
            System.out.println(e2);
            ts.add(e2);
        }
        System.out.println(ts);
    }
}
//The Sort function uses the compareTo() method to sort the values.
//Every object(Integer,Float,Double,Character,String...) everything has compareTo() method
//