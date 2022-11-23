package kodlama_io_website.business;

import kodlama_io_website.core.loging.Logger;
import kodlama_io_website.dataAccess.CourseDao;
import kodlama_io_website.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void addCourse(Course course) {
		if ((course.getName().equals("JAVA")
				|| (course.getName().equals("C++ ") || (course.getName().equals("C#")) || (course.getPrice() <= 0)))) {
			System.out.println("Bu kursu ekleyemessiniz...");
		} else {
			courseDao.addCourse(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
	}
}
