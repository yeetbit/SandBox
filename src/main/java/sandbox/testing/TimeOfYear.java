package sandbox.testing;

public class TimeOfYear {

	public String timeOfYear(String in) throws NumberFormatException{
		int useableIn = -1;
		useableIn = Integer.parseInt(in.trim().substring(1));
		return String.valueOf(useableIn);
					
	}
}
