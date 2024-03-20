package sayu;
import java.util.Date;
class B extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("welcome to thread");
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
			
		}
		}
	}
}

public class ExtendingD {

	public static void main(String[] args) {
		B b1=new B();
		b1.start();
		while(true)
		{
			System.out.println(new Date());
			try
			{
				Thread.sleep(1000);
			
			}
			catch(InterruptedException e)
			{
			
			}
		}
	}

}
