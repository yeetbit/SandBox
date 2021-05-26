import sandbox.testing.*;

public class Main{

    public static void main (String[] args) {

		if(args.length !=1 || args.length >2){
			badArgs("no or to many arguments ");
		}else {
			TimeOfYear toy = new TimeOfYear();
			try{
				if(args.length==2){
					String msg = toy.timeOfYear(args[0], args[1]);
					System.out.println(msg);
				}else{
					String msg = toy.timeOfYear(args[0]);
					System.out.println(msg);
				}			
			}catch(Exception e){

				badArgs(e);
				
			}

		}
    }

	public static void badArgs(Object msg){
		System.err.println("Usage: sandbox Time of year tool\n    sandbox w20      weeknumber\n    sandbox d150      daynumber\n");
		System.out.println(msg);
		System.exit(-1);
	}

}

