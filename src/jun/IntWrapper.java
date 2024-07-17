package jun;

// ovo za 2. zadatak pravimo klasu koja cuva integer al koja se moze promeni
// klasican Integer nije promenljiv nakon sto se kreira pa se ne moz koristi za ovo
// resenje

public class IntWrapper 
{
	private int value;
	
	public IntWrapper()
	{
		value = 0;
	}
	
	public IntWrapper(int v)
	{
		value = v;
	}
	
	public void SetValue(int v)
	{
		value = v;
	}
	
	public int GetValue()
	{
		return value;
	}
}
