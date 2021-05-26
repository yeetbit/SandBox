package sandbox.testing;

public class TimeOfYear {

	public String timeOfYear(String in){
		int useableIn = -1;
		try{
			useableIn = Integer.parseInt(in.trim());
					
			return String.valueOf(useableIn);
		}catch(Exception e){
			return "bad input"+e;
		}
	}
}
