import sandbox.testing.instantiableObjects.*;

public class Main{

    public static void main (String[] args) {

		Animal jansen = new Cat("Jansen", 2, "Male");
		jansen.eat();


    }

	public static long power(int num, int pow){

		var temp = num;
		for(var i=1;i<pow;i++){
			temp*=num;
		}
		return temp;

	}
}

