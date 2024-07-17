package jun2;

public class MojaNitSpora extends Thread
{ 
	public MojaNitSpora() {super("spora");}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println(this.getName());
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
}
