
import testing.*;

public class Main{

    public static void main (String[] args) {

		int n1 = 4;
		int n3 = 4;
		float f1 = n3;
		n3 = (int) f1;
		boolean b1 = n1==n3;

        // new StreamTests();
		// System.out.println(n1+" at the power of "+n2+" = "+exp);
		System.out.println("You can up-cast automatically from int to float "+ f1);
		System.out.println("You can down-cast from float to int "+ n3);
		System.out.println("\nEven while they are the same width");
    }

	public static long power(int num, int pow){

		var temp = num;
		for(var i=1;i<pow;i++){
			temp*=num;
		}
		return temp;

	}
}

