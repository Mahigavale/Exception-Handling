package miscellenious.demo;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Demo5 {

	
	public static void main(String args[]) throws InterruptedException,ConcurrentModificationException
	{
		
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		
		ConcurrentHashMap<Integer,String> map2=new ConcurrentHashMap<Integer,String>();
		
		
		
		for(int i=0;i<=10;i++)
		{
			map1.put(i,"value"+i);
			map2.put(i,"value"+i);
		}
		
		
		
		
		Thread t1=new Thread(()->
		{
			for(int i=10;1<=20;i++)
			{
				map1.put(i,"value"+i);
				//System.out.println("thread 1 added in hashmap"+i);
			}
		});
		
		Thread t2=new Thread(()->
		{
			for(int i=20;1<=30;i++)
			{
				map1.put(i,"value"+i);
				//System.out.println("thread 2 added in hashmap"+i);
			}
		});
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		System.out.println("final hash map :"+map1);
		
		Thread t3=new Thread(()-> {
			for(int i=10;i<=20;i++)
			{
				map2.put(i,"value"+ i);
			}
		});
		
		
		Thread t4=new Thread(()-> {
			for(int i=20;i<=30;i++)
			{
				map2.put(i,"value"+i);
			}
			
		});
		
		
		t3.start();
		t4.start();
		
		t3.join();
		t4.join();
		
		
		System.out.println("final concurrent hashmap :"+map2);
		
	}
}

