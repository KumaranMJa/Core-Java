import java.util.Scanner;
//For Eaach Loop, Print the array of objects
class Dumm{
    String Name ;
    int no;
}
public class ForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Dumm arr[] = new Dumm[n];
        for(int i=0;i<n;i++){
            Dumm d = new Dumm();
            d.Name=scan.next();
            d.no=scan.nextInt();
            arr[i]=d;
        }
        for(Dumm a : arr){ //it access the every elements from starting to ending.
            System.out.println(a.Name+" "+a.no);
        }
        scan.close();
    }
}
