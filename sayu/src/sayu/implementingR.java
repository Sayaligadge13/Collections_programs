package sayu;
import java.util.*;
class oddthread implements Runnable
{
	public void run() {
		for(int i=1;i<=20;i+=2)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
			
			}
		}
		}
	
	
}

public class implementingR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new oddthread());
		t.start();
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
