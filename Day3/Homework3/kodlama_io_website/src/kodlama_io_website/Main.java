package kodlama_io_website;

import kodlama_io_website.business.CategoryManager;
import kodlama_io_website.business.CourseManager;
import kodlama_io_website.business.InsturctorManager;
import kodlama_io_website.core.loging.DatabaseLogger;
import kodlama_io_website.core.loging.FileLogger;
import kodlama_io_website.core.loging.Logger;
import kodlama_io_website.dataAccess.HibernateDao;
import kodlama_io_website.dataAccess.JdbcDao;
import kodlama_io_website.entities.Category;
import kodlama_io_website.entities.Course;
import kodlama_io_website.entities.Instructor;

public class Main {
	
	public static void main(String[] args) {

		Course course1 =  new Course("JAVA", 170); 
		Course course2 = new Course("Python", 200);
		Category category = new Category("Mobil Programlama");
		Category category2 = new Category("Oyun Geliþtirme");
		Instructor instructor = new Instructor("Engin", "Demiroð", "engindemirog@gmail.com");
		Logger[] logers = {new DatabaseLogger(),new FileLogger()};
 		
		CourseManager courseManager = new CourseManager(new HibernateDao(),logers);  
		CourseManager courseManager2 = new CourseManager(new JdbcDao(),logers); 
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(),logers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcDao(),logers);
		
		InsturctorManager insturctorManager = new InsturctorManager(new JdbcDao(),logers);
		
		
		courseManager.addCourse(course1);
		courseManager2.addCourse(course2);
		categoryManager.addCategory(category);
		categoryManager2.addCategory(category2);
		insturctorManager.addInstructors(instructor);
	}
}
