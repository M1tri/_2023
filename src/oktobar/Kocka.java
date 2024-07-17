package oktobar;

public class Kocka extends Kvadrat
{	
	public Kocka (double a) 
	{ 
		// this.a = a;  ovo je greska jer a je privatno u majcinskog klasi, treba da se zove njen konstruktor
		super(a); // ovo je ispravka
	}
	
	public double površina() 
	{ 
		return 6 * površina(); 
	}
	
	// zadatak 3
	
		// najlakse samo stavi synchronized ispred metod lol, moze i sa lock_obj svjdn
	
	public synchronized double povrsina2()
	{
		return 6 * površina();
	}
	
	// zadatak 3
}