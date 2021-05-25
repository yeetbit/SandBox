package testing;

public class AbstractTesting extends StreamTests{

    public AbstractTesting(){
    }


  
    public void testy(String str) {
        System.out.println(str+"This is the original method.");

    }

    public void testNumber(Number haha){

        System.out.println(haha);

    }

    public Object testObject(Object haha){

        System.out.println(haha);
        return haha;

    }

    public void testCharSequence(char[] haha){

        System.out.println(haha);

    }

    public double testDouble(double haha){

        System.out.println(haha);

        return haha;

    }

    public void testEmpty(String str){};
    
}
