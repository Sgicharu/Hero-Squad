package models;
import javax.swing.text.html.HTMLWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.ArrayList;

public class hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<hero> instances = new ArrayList<>();

    public hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() {return this.name;}
    //    public String getCv() {
//        String cv = this.name && this.power;
//    }
    public int getAge() {return this.age;}
    public String getPower() {return this.power;}
    public String getWeakness() {return this.weakness;}
    public static ArrayList<hero> getAllInstances() {return instances;}
    public static void clearAllHeroes(){instances.clear();}
    public int getId(){return id;}
    public static hero findById(int id) {return instances.get(id-1);}
    public static hero setUpNewHero(){
        return new hero("Arnold",23,"flying","fire");
    }
    public static hero setUpNewHero1(){
        return new hero("Janet",30,"Night Vision","Light");
    }
    public static hero setUpNewHero2(){
        return new hero("Jay",30,"Night Vision","Light");
    }

}
}
