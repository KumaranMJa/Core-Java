import java.util.StringTokenizer;
//String Tokenizer - ibreaks the strings into tokens , it is a legacy class in java
public class StrToken {
    public static void main(String[] args) {
        String str = "Java Python Ml Js";
        StringTokenizer st = new StringTokenizer(str); //String Tokenizer is a class in java, 
        //it has string tokenization method to break a string , but   it is not an array
        st.hasMoreTokens(); // it moves to next token
        System.out.println(st.nextToken());// it clicks on the token to display;
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer("Communicatmion","m");//it breaks the m from the string and seperates the remaining
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken()); //op - co unicat ion
        }

    }
}
