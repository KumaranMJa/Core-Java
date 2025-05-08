package LastTopic.Comaprator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Student{
    private int rollno;
    private String name;
    Student(){

    }
    Student(int rollno , String name){
        this.rollno = rollno;
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return ""+rollno+" : "+name;
    }
}
class Demo1 implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        Integer r1 = s1.getRollno();
        Integer r2 = s2.getRollno();
        if(r1.compareTo(r2)==0){
            return s1.getName().compareTo(s2.getName());
        }
        else{
            return r1.compareTo(r2); //return r1.compareTo(r2)* -1  ; --> For Reverse(Custom Ordering )
        }
    }
}
public class Comp {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        TreeSet<Student> ts = new TreeSet<>(d); //Demo1 object (d) is passed as constructor to use comapre method to sort
        System.out.println("Enter the number of Student details to be entered : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            Student s = new Student();
            System.out.println("Enter the details as : rollno,name ");
            String details = sc.nextLine();
            String[] arr = details.split(",");
            s.setRollno(Integer.parseInt(arr[0])); //Integer.parseInt() ..it converts string to integer
            s.setName(arr[1]);
            ts.add(s);
        }
        System.out.println(ts);
    }
}
//Comparator interface has compare( , ) method
//Comparator should be implemented in separate class
//And Comparator implemented class object shoub be as constructor in Collection constructor.

//Comparable (compareTo())-- Difficult while changing according to objects we need to sort like first sort on name and changing to sort on number..
//....  ,As we need it to change it again and again .
//(Natural Ordering is where it used to order by default , sort by using most significant attribute)


//Comparator(compare()) -- As we implemented in separate class. We can create it for every (Wrapper class object)object that needed to sort..
//..., just we can change it on passing comparator class object to constructor.
//(Custom Ordering is where we order by any attribute we need and we can sort by reverse)