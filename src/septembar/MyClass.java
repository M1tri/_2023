package septembar;

public class MyClass 
{
	public void Metoda(int n) throws Exception, ExcA, ExcB
	{
		if (n == 0)
			throw new Exception("Obican");
		else if(n == 1)
			throw new ExcA();
		
		throw new ExcB("Izuzetak B");
	}
}
