package testing.instantiableObjects;

import java.util.List;

public class Animal {

    private String name;
    private String type;
    private String gender;
    private int age;

    protected Animal(List<String> l, int age){
        this.name = l.get(0);
        this.gender = l.get(1);
        this.type = l.get(2);
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

}   