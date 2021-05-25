package testing;

public class TimeOfYear {

	public String timeOfYear(String in){
		int useableIn = -1;
		try{
			useableIn = Integer.parseInt(in.trim());
			return new StringBuilder(useableIn);
					
		}catch(Exception e){
			return "bad input"+e;
		}
	}
}
