//Inheritence
class GrandParent{
    static String color ="brown";
    String eyeColor = "blue";
}
class Parent extends GrandParent{
    static  String noseShape = "normal";
}
class Child extends Parent{

}
public class Inherit {
    public static void main(String[] args) {
        //GrandParent c = new Child(); (UPCASTING [polymorphism])
        Child c = new Child();
        System.out.println(Child.color);
        System.out.println(c.eyeColor);
        System.out.println(Child.noseShape);
    }
}
//Inheritence is a class acquiring the properties and behaviour of another class.
//single - One Parent ---> one child
//multi-level  - One GrandParent ---> One Parent -----> One Child
//hierarchical - One Parent ---> Multiple Child(two or more child)
//Hybrid - Mixture of two or more inheritence type 
