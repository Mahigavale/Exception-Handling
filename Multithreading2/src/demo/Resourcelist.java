package demo;

import java.util.ArrayList;
import java.util.List;

public class Resourcelist {

	List<String> names=new ArrayList<String>();
	
	
	public Resourcelist()
	{
		names.add("msd");
		names.add("srt");
		names.add("vk");
		names.add("vvs");
		
		
	
	}
	
	
	public synchronized void setname(int index, String newname)
	{
		names.set(index, newname);
	}
	
	public synchronized List<String> getnames()
	{
		return names;
	}
	
}


//one after another.