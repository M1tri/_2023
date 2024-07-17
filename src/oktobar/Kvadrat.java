package oktobar;

import java.io.BufferedReader;
import java.io.DataInputStream;

public class Kvadrat 
{ 
	private double a;

	public Kvadrat (double a) 
	{ 
		this.a= a; 
	}

	public double površina() 
	{
		return Math.pow(a,2); 
	}	
	
	// zadatak 2, kaze zadatih tokova pa valjda dobija tok kao parametar mislim da je to hteo
	
	public void Ucitaj(BufferedReader br)
	{
		try
		{
			a = Double.parseDouble(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void Ucitaj(DataInputStream ds)
	{
		try
		{
			a = ds.readDouble();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	// ovo sam dodao da vidim dal lepo cita
	public void printA()
	{
		System.out.println(a);
	}
	
	
	
}
