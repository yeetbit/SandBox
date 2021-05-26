package sandbox.testing; 

enum Seasons{
	WINTER("6 december tot en met 28 februari")
	{
		public String trends(){
			return "List of cloathing shops with korting";
		}
	},
	SPRING("1 maart tot en met 31 mei")
	{
		public String trends(){
			return "List of cloathing shops with korting";
		}
	},
	SUMMER("1 juni tot en met 31 augustus")
	{
		public String trends(){
			return "List of cloathing shops with korting";
		}
	},
	FALL("1 september tot en met 30 november")
	{
		public String trends(){
			return "List of cloathing shops with korting";
		}
	};


	private final String whichDate;
	Seasons(String whichDate){
		this.whichDate = whichDate;
	}

	public String dates(){
		return this.whichDate;
	}
	public abstract String trends();


}
