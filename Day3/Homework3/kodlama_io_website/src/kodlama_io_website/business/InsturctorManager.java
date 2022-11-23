package kodlama_io_website.business;

import kodlama_io_website.core.loging.Logger;
import kodlama_io_website.dataAccess.InstructorDao;
import kodlama_io_website.entities.Instructor;

public class InsturctorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InsturctorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;

	}

	public void addInstructors(Instructor instructor) {
		instructorDao.addInstructor(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

}
