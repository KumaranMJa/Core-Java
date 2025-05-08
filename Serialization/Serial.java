package Serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
    private String name;
    private int id;

    public Customer() {
    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name : "+name+", id : "+id;
    }



}


public class Serial {
    public static void main(String[] args) {
        Customer c1 = new Customer("Bobi",102);
        String path = "D:\\TAP\\CoreJava\\1_Tap_Java\\dummy2.txt";
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c1);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
