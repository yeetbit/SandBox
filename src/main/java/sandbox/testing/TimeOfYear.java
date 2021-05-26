package sandbox.testing;

public class TimeOfYear {
	private StringBuilder combined;
	private boolean trend = false;

	public String timeOfYear(String in) throws NumberFormatException{
		if(verSeas(in)){
			return String.valueOf(combined);
		}
		int useableIn = -1;
		useableIn = Integer.parseInt(in.trim().replaceAll("[\\D]", ""));
		return String.valueOf(useableIn);			
	}

	public String timeOfYear(String in, String argT){
		if(argT.equalsIgnoreCase("trend")){
			trend = true;
			verSeas(in);
			return String.valueOf(combined);
		}else{
			return "unknown arguments"; 
		}
	}

	private boolean verSeas(String in){
		for(Seasons s:Seasons.values()){
			if(in.equalsIgnoreCase(s.name())){
				combined.append(in.toLowerCase()+" "+s.dates());
				if(trend){combined.append("\n"+s.trends());}
				return true;
			}
		}
		return false;
	}
}
