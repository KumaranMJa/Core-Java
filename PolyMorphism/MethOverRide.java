class Animal{
    int lifeTime = 14;
    void life(){
        System.out.println("Animals Live in Land");
    }
    void hunt(){
        System.out.println("Animals Hunt");
    }
}
class Lion extends Animal{
    int lifeTime=10;
    @override //anotation need to be typed for overriden method
    void hunt(){
        super.hunt(); //super keyword calls the parent class method
        System.out.println("Lion Hunt for food");
        System.out.println(super.lifeTime); //super keyword calls the variables in the parent method.
    }
}
public class MethOverRide {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.hunt();
        System.out.println(l1.lifeTime);
    }
}
