package LastTopic.Comparable;

import java.util.Scanner;
import java.util.TreeSet;
class Student implements  Comparable<Student>{
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
    @Override 
    public int compareTo(Student s2){
        Student s1 = this;
        Integer rn1 = s1.rollno;
        Integer rn2 = s2.rollno;
        if(rn1.compareTo(rn2) == 0){
            return s1.name.compareTo(s2.name);
        }
        else{
            return rn1.compareTo(rn2);
        }
    }
    @Override
    public String toString(){
        return ""+rollno+" : "+name;
    }
}
public class Comparat2 {
   public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
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
//collections.sort() method is used in Lists only , not in sets
//In map it will sort automatically