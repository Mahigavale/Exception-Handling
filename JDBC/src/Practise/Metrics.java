package Practise;

import java.util.Iterator;

public class Metrics {

	public static void main(String[] args) {
		import java.util.List;
		import java.util.ArrayList;
		import java.util.Arrays;
		 
		// 1. Student Model
		public class Student {
		    private Long id;
		    private String name;
		    private String email;
		   
		    // Constructor
		    public Student(Long id, String name, String email) {
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
		 
		// 2. Controller with only Update functionality
		@RestController
		@RequestMapping("/api/students")
		public class StudentController {
		   
		    // Simulate database with a list
		    private List<Student> students = new ArrayList<>(Arrays.asList(
		        new Student(1L, "John Doe", "john@example.com"),
		        new Student(2L, "Jane Smith", "jane@example.com")
		    ));
		   
		    // Update student endpoint
		    @PutMapping("/{id}")
		    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
		        
		    	
		    	 Iterator<Student> itr=Students.iterator();
		    	 
		    	 while(itr.next())
		    	 {
		    		 Student st
		    	 }
		    
		    	 
		    	
		    	
		        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		}
		 

	}

}
