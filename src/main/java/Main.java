
import testing.*;

public class Main{

    public static void main (String[] args) {

		int n1 = 4;
		int n2 = 4;


		boolean b1 = n1==n2;

		long exp = power(n1, n2);
        // new StreamTests();
		System.out.println(n1+" at the power of "+n2+" = "+exp);

    }

	public static long power(int num, int pow){

		var temp = num;
		for(var i=1;i<pow;i++){
			temp*=num;
		}
		return temp;

	}
}

