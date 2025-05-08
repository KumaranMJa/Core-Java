
class Custom {
    private int id;
    private String name;
    private int no;

    public Custom() { // executes 3rd
        id = 1;
        name = "Kums";
        no = 678912;
    }

    public Custom(int id) {
        this(); // execetes 2nd , it calls the constructor with zero parameter.
        this.id = id; //exectues 4th, after executing that constructor , it follows up the code.
    }

    public Custom(int id, String name, int no) {
        this(id); // executes 1st , and it calls the constructor with integer parameter
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }
}

public class Encapsul2 {
    public static void main(String[] args) {
        Custom c1 = new Custom(100, "Bhavani", 123456);
        System.out.println(c1.getName()+"\n"+c1.getId()+"\n"+c1.getNo());
        System.out.println("\\n , to print thr reserved word use back-slash before the reserved word");
    }
}
// this - is a keyword , this() - is a call method used for constructor
// chaining.
//calling anoter constructor from a constructor of same class it is known as local chaining.