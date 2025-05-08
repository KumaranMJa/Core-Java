package Enum_meration;
//Enum class is to store the constants , instead of creating a String or object for displaying it for a function
enum Status{
    Running , Pending , Failed , Success;
}
public class EnumIntro {
    public static void main(String[] args) {
       Status s = Status.Running; //Stats(enum class) , s --> it stores the constant of enum
       System.out.println(s);
       System.out.println("s :"+s+", ordinal value(order) of s : "+s.ordinal());  //ordinal it gives the order in which the constant present in enum
       Status ss[] = Status.values(); //values method of enum class returns the all constant values in array
       for(Status x : ss){
        System.out.println(x);
       }
       //Enum in If Else
       if(s == Status.Success){ //in if else of enum , we need to mention Status(enum ref).(constatnt) as to define the value to check
        System.out.println("The program is done successfully");
       }
       else if(s==Status.Pending){
        System.out.println("The program is Pending");
       }
       else if(s==Status.Running){
        System.out.println("The program is Running");
       }
       //Enum in switch case
    switch (s) { //while in switch we given s , as s is enum , then the value will automatically taken as enum constants 
        case Success:
            System.out.println("The program is done successfully");
            break;
        case Pending:
            System.out.println("The program is Pending");
            break;
        case Running:
            System.out.println("The program is Running");
            break;
        default:
            break;
    }
    }
}
