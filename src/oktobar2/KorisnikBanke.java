package oktobar2;

public class KorisnikBanke extends Thread
{
	BankovniRacun racun;
	
	public KorisnikBanke(BankovniRacun racun)
	{
		this.racun = racun;
	}
	
	@Override
	public void run()
	{
		int i = 0;
		
		while (i < 4)
		{
			if (i % 2 == 0)
				racun.Azuriraj(i * 100);
			else
				System.out.println(this.getName() +  " " + racun.Procitaj());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i++;
		}
	}
}
