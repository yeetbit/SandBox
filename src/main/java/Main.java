import sandbox.testing.instantiableObjects.*;

public class Main{

    public static void main (String[] args) throws Error {

		if(args.length !=1 || args.length >1){
			System.err.println("Usage: sandbox Time of yAear tool\n    sandbox -w 20 // weeknumber\n    sandbox -d 150 // daynumber\n    cheers");
			System.out.
			System.exit(-1);
		}else {
			TimeOfYear toy = new TimeOfYear();
			String msg = toy.timeOfYear(args[0]);
			System.out.println(msg);
		}
    }
}

