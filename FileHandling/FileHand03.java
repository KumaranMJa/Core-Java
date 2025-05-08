package FileHandling;

import java.io.FileReader;

public class FileHand03 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\TAP\\CoreJava\\1_Tap_Java\\dummy.txt");
            int c = fr.read();
            while(c != -1){
                System.out.print((char)c);
                c = fr.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
//File Reader reades the data in file as character by character as by ASCII value
//if nothing is file , it returns -1
