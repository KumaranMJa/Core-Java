class Demo{
    void display() throws Exception{
        int x = 10/0;
    }
}
public class ExcHand06 {
    public static void main(String[] args) {
        Demo d = new Demo();
        try{ 
        d.display();
        }
        catch(Exception e){
            System.out.println("Exception Occured");
            e.printStackTrace();
        }
    }
}
//Ducking Exception using throws, where the critical statment throws the exception to calling block to handle the exception
//This code works fine on online compiler