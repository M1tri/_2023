package oktobar2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CitacRazlomka 
{
	public CitacRazlomka() {}
	
	public static void Procitaj(String ime)
	{
		FileReader fd = null;
		BufferedReader rd = null;
		try 
		{
			fd = new FileReader(ime);
			rd = new BufferedReader(fd);
			
			String text = rd.readLine();
			rd.close();
			
			String[] brojke = text.split("/");
			
			if (brojke.length != 2)
				throw new Exception("Razmak nije unet pravilno");
			
			String imenioc = brojke[0];
			String brojilac = brojke[1];
			
			double im = Double.parseDouble(imenioc);
			double br = Double.parseDouble(brojilac);
			
			if (br == 0)
				throw new NedefinisanRazlomak("Ne moze deljenje nulom");
			
			double rez = im / br;
	
			System.out.println(rez);
			
			FileOutputStream fs = new FileOutputStream("razlomak.bin");
			BufferedOutputStream bs = new BufferedOutputStream(fs);
			DataOutputStream ds = new DataOutputStream(bs);
			
			ds.writeDouble(rez);
			ds.close();
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch (NedefinisanRazlomak e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
