package sayu;
class A extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("welcome to thread");
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

public class Extending {
	

	public static void main(String[] args) {
		A a1=new A();
		a1.start();
		System.out.println("java is easy language");
		

	}

}
