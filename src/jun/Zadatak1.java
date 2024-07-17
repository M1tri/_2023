package jun;

import java.util.Random;

public class Zadatak1 
{
	public static int[][] NapraviPolje(int d)
	{
		int[][] polje = new int[2 * d][];
		Random ran = new Random();
		
		
		int lenghtNext = 0;
		for (int i = 0; i < 2*d; i++)
		{
			if (i % 2 == 0)
			{
				lenghtNext = (Math.abs(ran.nextInt()) % d) + 1;
				polje[i] = new int[1];
				polje[i][0] = lenghtNext;
 			}
			else
			{
				polje[i] = new int[lenghtNext];
				for (int j = 0; j < lenghtNext; j++)
					polje[i][j] = ran.nextInt();
			}	
		}
			
		return polje;
	}
	
}
