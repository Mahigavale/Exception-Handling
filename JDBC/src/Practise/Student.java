package Practise;
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
