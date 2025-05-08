import java.util.Scanner;
class StrRev{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        int len = s1.length();
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2+=s1.charAt(len-1);
            len--;
        }
        System.out.println(s2);
        scan.close();
    }
}