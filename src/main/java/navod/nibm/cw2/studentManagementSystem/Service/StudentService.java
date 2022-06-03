package navod.nibm.cw2.studentManagementSystem.Service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import navod.nibm.cw2.studentManagementSystem.Domain.Student;
import navod.nibm.cw2.studentManagementSystem.Repository.StudentRepository;
 
@Service
public class StudentService {
 
@Autowired
    private StudentRepository repo;
public List<Student> listAll()
{
System.out.println(repo.findAll());
        return repo.findAll();
    }
    
 
    public void save(Student std) {
        repo.save(std);
    }
    
    public Student get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}