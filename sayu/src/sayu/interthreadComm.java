package sayu;
import java.util.*;
class Q
{
	int num;
	boolean valueset=false;
	public synchronized void put (int num)
	{
		while(valueset)
		{
			try
			{
				wait();
				
			}catch(Exception e)
			{
			}
				
			}
		System.out.println("put:"+num);
		this.num=num;
		valueset=true;
		notify();
	}
	public synchronized void get()
	{
		while(!valueset)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				
			}
			
		}
		valueset=false;
		System.out.println("Get:"+num);
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
	public Producer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Producer");
		t.start();
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true)
		{
			q.put(i++);
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
}
class Consumer implements Runnable
{
	Q q;
	public Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
public class interthreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

	}

}
