
//Cloning is done to copy a object

//Here we done a Deeper Copy, where objects are cloned, not mapped to the references
class Department implements Cloneable{
    int deptId;
    String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
     void display(){
        System.out.println(deptId+"\n"+deptName);
     }

     @Override
     protected Object clone() throws CloneNotSupportedException {
        return super.clone();
     };
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
        Student s = (Student) super.clone();
        s.dept = (Department) s.dept.clone();
        return s;
    };

}
public class Clone02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d1 = new Department(100, "IT");
        Student s1 = new Student(1, "Hari", d1);
        //Cloning
        Student s2 = (Student)s1.clone();

        s1.dept.deptName = "CSE";
        s2.display();
    }
}
//Objects are also cloned here, this is deeper copy, so the clone and real objects does not affect each other.