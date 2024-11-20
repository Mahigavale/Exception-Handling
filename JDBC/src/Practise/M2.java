package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class M2 {
	
	public static void main(String args[])
	{
		
		// Simulate database with a list
		  List<Student> students = new ArrayList<>(Arrays.asList(
		     new Student(1L, "John Doe", "john@example.com"),
	     new Student(2L, "Jane Smith", "jane@example.com")
		 ));
		 
		 
		  for(Student s:students)
		  {
			  System.out.println(s.getName());
			  System.out.println(s.getEmail());
		  }
		  
		  
		  Iterator<Student> itr=students.iterator();
		  
		  //2L
		  
		  while(itr.hasNext())
		  {
			  Student st=itr.next();
			  if(st.getId()==2L)
			  {
				  st.setEmail("parth@gmail.com");
				  st.setName("Parth k");
			  }
			  
			
		  }
		  System.out.println("updated list");
		  System.out.println("***********************************");
		  for(Student s:students)
		  {
			  System.out.println(s.getName());
			  System.out.println(s.getEmail());
		  }
		  
		 
		 
	}
	
	
}
 class StudentM {
    private Long id;
    private String name;
    private String email;
   
    // Constructor
    public StudentM(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
   
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
 