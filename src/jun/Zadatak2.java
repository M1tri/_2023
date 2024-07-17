package jun;

public class Zadatak2 
{
	
	// Nzm jos koji nacin iskreno mnogo glup ovako kad kaze resite na sve nacine
	
	public static void Zameni(IntWrapper i1, IntWrapper i2)
	{
		int pom = i1.GetValue();
		i1.SetValue(i2.GetValue());
		i2.SetValue(pom);
	}
}
