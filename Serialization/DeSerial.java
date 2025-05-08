package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


class Customer implements  Serializable{
    String name;
    int id;

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


public class DeSerial {
    public static void main(String[] args) {
        String path = "D:\\TAP\\CoreJava\\1_Tap_Java\\dummy2.txt";
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Customer c1 = (Customer) ois.readObject();
            System.out.println(c1.getName());
            System.out.println(c1.getId());
            System.out.println(c1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
