package navod.nibm.cw2.studentManagementSystem.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import navod.nibm.cw2.studentManagementSystem.Domain.Course;
import navod.nibm.cw2.studentManagementSystem.Repository.CourseRepository;
 
@Service
public class CourseService
{
@Autowired
    private CourseRepository repo;
public List<Course> listAll() {
        return repo.findAll();
    }
    
    public void save(Course course) {
        repo.save(course);
    }
    
    public Course get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}