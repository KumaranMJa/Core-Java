class Bank{
    private String name;
    private int age;
    private int balance ; //private is to give security, so no one can access other than their own class
    private int accNo ;
    //getter and setter is to access the private data by other class.
    public void setBal(int balance){ //Input parameter here is a local variable, which is inside main method.
        if(balance>0){
            this.balance = balance; //this - refers to the instace varaiable of the class.
        }
        else{
            System.out.println("Invalid Balance");
        }
    } 
    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    public void setInfo(String name , int age){
        this .name = name;
        this.age = age;
    }
    public int getBal(){
        return balance;
    }
    public int getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
//Each private variable should have seperate getters(can return only one value) and setters(setters can be oneas multiple input parameter) to access it.
//setters and getters should be public  access modifier or atleast default modifier.
public class Encapsul1 {
    public static void main(String[] args) {
        Bank a = new Bank();
        a.setBal(9669);
        a.setAccNo(1234560987);
        System.out.println(a.getBal());
        System.out.println(a.getAccNo());
        a.setInfo("Kumaran", 22);
        System.out.println(a.getName()+" "+a.getAge());
        //System.out.println(a.coolent); //private thing cant access by other class
    }
}
//abstract is to give the security(hide the data) to the objects
//To access the secured things we use getter and setter method