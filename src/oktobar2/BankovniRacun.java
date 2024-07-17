package oktobar2;

public class BankovniRacun 
{
	private final Object lock_obj = new Object();
	private int stanje;
	
	public BankovniRacun()
	{
		stanje = 0;
	}
	
	public void Azuriraj(int novoStanje)
	{
		synchronized(lock_obj)
		{
			stanje = novoStanje;
		}
	}
	
	public int Procitaj()
	{
		synchronized (lock_obj)
		{
			return stanje;
		}
	}
}
