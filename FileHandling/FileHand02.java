package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class FileHand02 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dummy.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Ding Dong");
            bw.newLine();
            bw.write("You Win");
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//Buffered Writer first writes the data in Buffer , after the buffer is full it writes(flushed) in file
//Where File Writer writes the data in file by character  by character