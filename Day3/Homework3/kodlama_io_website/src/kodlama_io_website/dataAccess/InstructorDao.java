package kodlama_io_website.dataAccess;

import kodlama_io_website.entities.Instructor;

public interface InstructorDao {

	void addInstructor(Instructor instructor);
	void deleteInstructor(Instructor instructor);
}
