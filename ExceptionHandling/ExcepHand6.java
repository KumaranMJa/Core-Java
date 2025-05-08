import java.util.Scanner;

public class ExcepHand6 {
    public static void main(String[] args){
        //alpha();
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int c = 100/n;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e.getMessage()); //(Descption of Exception)it gets the description of why the exception occurs.
            System.out.println(e); //(descption + kind of exception) it prints the details of exception
            e.printStackTrace(); //(descption + kind of exception + where it occurs) it traces out the exception where it comes from amd what exception it is.
        }
        System.out.println("Connection Terminated");
    }
    /*static void alpha(){
        try{
            alpha();//stack overflow error , bcox calling it again and again without ending
        }
        catch(Error x){
            System.out.println("Error handled");
        }
    }*/
}
//Inbuild classes of Exception areAriyhmaticExceptuin, TnputMisMatch etc...
//Exception are passed as object to RTS(Run Time Excetion) when an exception occurs
//Error and Exceptuion are different , in error catch block should have Error & its class object ref eg: catch(Error e){ }