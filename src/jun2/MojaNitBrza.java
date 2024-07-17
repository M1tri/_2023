package jun2;

public class MojaNitBrza implements Runnable 
{
	public MojaNitBrza()
	{
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Moja nit brza");
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	
}
