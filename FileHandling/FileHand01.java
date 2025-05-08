package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileHand01 {
    public static void main(String[] args) throws IOException {
        try { //File handling is a checked Exception (IO Exception)
            FileWriter fw = new FileWriter("dummy.txt",true);//need to set true for append
            fw.write("Hello");//it will override the text in file and write in the file
            fw.append(" Hey");//it will add the text with the existing text in the file
            fw.close();
            System.out.println("Successfully Written");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
