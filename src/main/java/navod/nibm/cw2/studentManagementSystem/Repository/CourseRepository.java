package navod.nibm.cw2.studentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import navod.nibm.cw2.studentManagementSystem.Domain.Course;
 
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
 
}