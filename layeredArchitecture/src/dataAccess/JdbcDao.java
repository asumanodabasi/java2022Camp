package dataAccess;

import java.util.List;

import entities.Category;
import entities.Course;
import entities.Instructor;
import fakeData.FakeData;

public class JdbcDao implements IDatabaseDao{

	@Override
	public void addCategoty(Category category) {
		FakeData.categories.add(category);
		System.out.println(category.getName()+" Added with JDBC");
		
	}

	@Override
	public void addCourse(Course course) {
		FakeData.courses.add(course);
		System.out.println(course.getName()+" Added with JDBC");
		
	}

	@Override
	public void addInstructor(Instructor instructor) {
		FakeData.instructors.add(instructor);
		System.out.println(instructor.getName()+  " Added with JDBC");
	}

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		return FakeData.courses;
	}

}
