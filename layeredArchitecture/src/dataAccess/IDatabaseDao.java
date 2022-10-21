package dataAccess;

import java.util.List;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface IDatabaseDao {
	void addCategoty(Category category);
	void addCourse(Course course);
	void addInstructor(Instructor instructor);
	List<Course> getCourseList();
}
