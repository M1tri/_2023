package septembar;

public enum Boje 
{
	Crvena
	{
		public char engSlovo() { return 'R';}
	},
	
	Zelena
	{
		public char engSlovo() { return 'G';}		
	},
	
	Plava
	{
		public char engSlovo() { return 'B';}	
	};
	
	public abstract char engSlovo();
}
