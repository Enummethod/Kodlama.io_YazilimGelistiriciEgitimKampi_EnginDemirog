package kodlama_io_website.dataAccess;

import kodlama_io_website.entities.Category;
import kodlama_io_website.entities.Course;
import kodlama_io_website.entities.Instructor;

public class JdbcDao implements CourseDao ,CategoryDao, InstructorDao{


	@Override
	public void addCourse(Course course) {
		System.out.println("Hibernate ile " + course.getName() + " kursu eklendi...");
	}

	@Override
	public void addCategory(Category category) {
		System.out.println("Hibernate ile " + category.getCategoryName() + " Kategorisi eklendi...");
	}

	@Override
	public void deleteCategory(Category category) {
		
		System.out.println("JDBC ile " + category.getCategoryName() + " Kategorisi silindi...");
	}

	@Override
	public void addDeleteCourse(Course course) {
		System.out.println("JDBC ile " + course.getName()+ " Kursu eklendi...");
	}

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("JDBC ile " + instructor.getFirstName() + " " + instructor.getLastName()+ " adlý Eðitmen eklendi...");
	}

	@Override
	public void deleteInstructor(Instructor instructor) {
		System.out.println("JDBC ile " + instructor.getFirstName() + " " + instructor.getLastName()+ " adlý Eðitmen silindi...");
	}

}
