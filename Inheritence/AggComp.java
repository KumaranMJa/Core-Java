//Aggregation - Child exist independently without parent(outside parent object)
//Compostion - Child cannot exist independently without parent(inside parent object)

class Os{ //Composition - Example --> Mobile and OS
    private String name;
    private int ram;

    public Os(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }
}
class Charger{ //Aggregation - example --> Mobile and charger
    private String name;
    private int voltage;

    public Charger(String name, int voltage) {
        this.name = name;
        this.voltage = voltage;
    }

    public String getName() {
        return name;
    }

    public int getVoltage() {
        return voltage;
    }
}
class Mobile{  
    Os o = new Os("APPLE IPHONE" , 4); //compostion object
    void hasA(Charger c){ //get the child(charger) object reference from outside
        System.out.println(c.getName());
        System.out.println(c.getVoltage());
    }
}
public class AggComp {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Charger c = new Charger("APPLE CHARGER", 20); //Aggregation object , passes reference to mobile(parent) object
        System.out.println(m.o.getName());
        System.out.println(m.o.getRam());
        m.hasA(c);
    }
}
