package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileHand04 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\TAP\\CoreJava\\1_Tap_Java\\dummy.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while( line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//Buffered Readder will read the data as line by line , and it read as String
//If no line in file, it returns null