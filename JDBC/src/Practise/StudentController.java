package Practise;
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
        // <YOUR_CODE>
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
 