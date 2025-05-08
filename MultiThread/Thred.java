public class Thred {
    public static void main(String[] args) {
        for(int i=65 ; i<=90;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(3000); //thread is comes under exception,it ducking an exception
            }
            catch(Exception e){
                System.out.println("Exception Handled");
            }
        }
    }
}
