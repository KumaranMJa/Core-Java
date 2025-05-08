package Enum_meration;
enum Laptop{ //enum is a abstract class, constants in enum is object of enum class
    Win(1000),Mac(2000),Linux(3000); //it acts as constructors by using () , as it all are objects of enum class Laptop
    private int price;
    Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
} //in enum class we can define variables and methods
public class Enum2 {
    public static void main(String[] args) {
       Laptop []lp = Laptop.values();
       for(Laptop x : lp){
        System.out.println("Name : "+x+" Price : "+x.getPrice());
       } 
    }
}
