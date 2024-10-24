package demo;

import java.util.ArrayList;
import java.util.List;

public class sharedresource {
	
	
	
	List<String> names=new ArrayList<String>();
	
	
	public sharedresource()
	{
		names.add("mahesh");
		names.add("mansi");
		names.add("pooja");
		names.add("saroj");
		
	}
	
	
	
public synchronized List<String> getnames()
{
	
	
	return names;
	
}

public synchronized void setnames(int index,String name)
{
	
	names.set(index, name);
}

}
