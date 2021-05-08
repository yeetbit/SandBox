package testing;

import java.util.ArrayList;
import java.util.List;

public class test {
    private Integer a, b, c, d;

    private String name;

    public test(){
        a = b = c = d = 9;
    }

    public test(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public static void yeet(String yeet){
        System.out.println(yeet+ "this is my own method");
    }
    

    public int getNine(){
        return a;
    }
    public String getHexNine(){
        String joe = Integer.toHexString(a);
        return joe;
    }

    private static class harry {

    }

}