public class DataType {
    //Data Type converst types of data into 0's and 1's
    public static void main(String[] args) {
        //FLoat
        long l= 1020500l;
        byte b = 127;
        short s =  32767;
        int c = 0b0100101; //Binary(0-1)  - 0b - prefix
        int d = 050; //Octal(0-7) - 0 as prefix
        int e = 0x55; //HexaDecimal(0-9-A-F) -0x as prefix
        System.out.println(l+" "+b+" "+s+" "+c+" "+d+" "+e);
        double doub= 1000.12345;
        float flo = 2000.1223f; //float can take upto ony 4 values after decimal points
        System.out.println(doub+" "+flo);
        System.out.println(String.format("%.2f", flo)+" "+String.format("%.3f", doub));
        char cr = 'k';
        char cr2 = 'S';
        char cr3 ='6';
        System.out.println(cr+" "+cr2+" "+cr3);
        int tc1 = cr2 , tc2 = cr3; //Implicit TypeCast . from small size data type to big size data type.
        System.out.println(tc1+" "+tc2);
        boolean boo = true;
        boolean bo = false;
        System.out.println(boo+" "+bo);
        char tc3 = (char)65;
        System.out.println(tc3);
    }
}
