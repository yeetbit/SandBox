import sandbox.testing.instantiableObjects.*;

public class Main{

    public static void main (String[] args) {

		if(args.length !=1 || args.length >1){
			System.err.println("Usage: sandbox Time of year tool\n    sandbox -w 20 // weeknumber\n    sandbox -d 150 // daynumber\n    cheers");

			

    }

	public static long power(int num, int pow){

		var temp = num;
		for(var i=1;i<pow;i++){
			temp*=num;
		}
		return temp;

	}
}

