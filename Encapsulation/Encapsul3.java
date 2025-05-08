
import java.util.Scanner;

class Practise{
    private int id;
    private String name;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;

}
public class Encapsul3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of objects to be created :");
        int n = scan.nextInt();
        Practise p[] = new Practise[n];
        scan.nextLine();
        for(int i=0 ;i<n;i++){
            Practise p1 = new Practise();
            System.out.println("Enter the details of "+i+" st one with ,: name,id,age");
            String input = scan.nextLine();
            String []arr = input.split(",");
            p1.setName(arr[0]);
            p1.setId(Integer.parseInt(arr[1]));
            p1.setAge(Integer.parseInt(arr[2]));
            //System.out.println("Details of "+i+" st one name , age , id: \n"+p1.getName()+"\n"+p1.getAge()+"\n"+p1.getId());
            p[i] = p1;
        }
        for(Practise x : p){
            System.out.println(x.getName()+" "+x.getId()+" "+x.getAge());
        }
        scan.close();
    }
}
//To Convert string to integer --> Integer.parseInt("1000");
