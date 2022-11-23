package kodlama_io_website.dataAccess;

import kodlama_io_website.entities.Course;

public interface CourseDao {
	
	void addCourse(Course course);
	void addDeleteCourse(Course course);

}
