package oktobar2;


public class Klasa implements Interfejs 
{
	private int x;
	public Klasa (int x)
	{
		this.x = x;
	}
	
	// ovo nije iz interfesja
	public int zbir(Integer x)
	{
		return x.intValue() + this.x;
	}
	
	
	// dopuna
	public int zbir(int x)
	{
		return this.x + x;
	}
	
	public double proizvod (double x)
	{
		return this.x * x;
	}
	// dopuna
}