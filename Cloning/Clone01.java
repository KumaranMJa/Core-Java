package Cloning;

//Cloning is done to copy a object

//Here we done a Shallow Copy, where objects are not cloned they just map to the references only primitive data are cloned
class Department{
    int deptId;
    String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
     void display(){
        System.out.println(deptId+"\n"+deptName);
     }
}


class Student implements Cloneable{
    int stdId;
    String stdName;
    Department dept;

    public Student(int stdId, String stdName, Department dept) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.dept = dept;
    }

    void display(){
        System.out.println(stdId+"\n"+stdName);
        dept.display();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    };

}
public class Clone01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d1 = new Department(100, "IT");
        Student s1 = new Student(1, "Hari", d1);
        //Cloning
        Student s2 = (Student)s1.clone();

        s1.dept.deptName = "CSE";
        s2.display();
    }
}
//Objects are not cloned here they are just mapped to the same object, only primitive data types are cloned here.