package testing.instantiableObjects;

import java.util.Random;

public class PersonFactory {
    private static int old = 0;

    /* 
        Im not sure, but I think this is called a singleton?
    */

    private String name;
    final private String[] names = {"Ron","Bob","Klaas","Joop","Donald","Ronald","Henkie","Frenkie"};

    public PersonFactory(){};

    private PersonFactory(String name){
        this.name = name;
        System.out.println("Created instance of: "+name);
    }

    public String getName(){
        return this.name;
    }

    public PersonFactory createPerson(){
        String n = pickRandomName();
        return new PersonFactory(n);
    }

    private String pickRandomName(){
        int i = new Random().nextInt(names.length-1);
        return names[i];
    }
    
}
