package _2023;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import jun.*;
import septembar.*;
import oktobar.*;
import jun2.*;
import oktobar2.*;

public class Glavna 
{
	public static void main(String[] args)
	{
		// Jun
		
		int[][] polje = jun.Zadatak1.NapraviPolje(5);
		
		for (int i = 0; i < polje.length; i++)
		{
			for (int j = 0; j < polje[i].length; j++)
			{
				System.out.print(polje[i][j] + " ");
			}
			System.out.println();
		}
		
		jun.IntWrapper i1 = new jun.IntWrapper(3);
		jun.IntWrapper i2 = new jun.IntWrapper(4);
		
		System.out.println(i1.GetValue() + " " + i2.GetValue());

		jun.Zadatak2.Zameni(i1, i2);

		System.out.println(i1.GetValue() + " " + i2.GetValue());
		
		// Jun
		
		
		// Septembar
		
		Boje zelena = Boje.Zelena;
		System.out.println(zelena.engSlovo());
		MyClass k = new MyClass();
		
		int n = 2; // menjaj ovde al radi sve, bitno je samo da obican exception bude zadnji u listu
		try
		{
			k.Metoda(n);
		}
		catch (ExcA e)
		{
			System.out.println(e.getMessage());
		}
		catch(ExcB e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		// Septembar
		
		
		// Oktobar
		
		
		Kvadrat kv = new Kvadrat(4.2);
		Kvadrat kv2 = new Kvadrat(192);
		
		try
		{
			FileOutputStream fs = new FileOutputStream("kvadratBin.bin");
			BufferedOutputStream bos = new BufferedOutputStream(fs);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeDouble(69.0);
			
			FileWriter fs2 = new FileWriter("kvadrat.txt");
			BufferedWriter bw = new BufferedWriter(fs2);
			
			Double pov = 123.0;
			bw.write(pov.toString());
			
			
			dos.close();
			bw.close();
			
			FileInputStream fis = new FileInputStream("kvadratBin.bin");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			
			FileReader fr2 = new FileReader("kvadrat.txt");
			BufferedReader br = new BufferedReader(fr2);
			
			kv.Ucitaj(dis);
			kv2.Ucitaj(br);
			
			dis.close();
			br.close();
			
			kv.printA();
			kv2.printA();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		// Oktobar
		
		// Jun2 
		
		jun2.I2[] niz = new jun2.I2[10];
		
		for (int i = 0; i < niz.length / 2; i++)
		{
			niz[i] = new K1();
		}
		
		for (int i = niz.length / 2; i < niz.length; i++)
		{
			niz[i] = new K2();
		}
		
		for (int i = 0; i < niz.length; i++)
			niz[i].f();
		
			
			// 3. zadatak, ovo su oba nacina kako mozes da napravis niti nije se trazilo al uradio sam da vidis
		Thread spora = new MojaNitSpora(); // extenduje Thread
		Thread brza = new Thread(new MojaNitBrza()); // implementira runnable
		
		// spora.start();
		// brza.start();
		
		// Jun2
		
		// Oktobar2
		
		oktobar2.CitacRazlomka.Procitaj("razlomak.txt");
		
		BankovniRacun r = new BankovniRacun();
		Thread kor1 = new KorisnikBanke(r);
		Thread kor2 = new KorisnikBanke(r);
		
		kor1.start();
		kor2.start();
		
		// Oktobar2
		
		
		
		
		
	}
}
