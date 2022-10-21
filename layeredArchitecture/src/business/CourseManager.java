package business;

import java.util.List;

import core.Logger;
import dataAccess.IDatabaseDao;
import entities.Course;
import fakeData.FakeData;

public class CourseManager {
 	private IDatabaseDao databaseDao;
		private Logger [] loggers;
		public CourseManager(IDatabaseDao databaseDao,Logger [] loggers)
		{
			this.databaseDao=databaseDao;
			this.loggers=loggers;
		}
		
		
	public void add(Course course) throws Exception{
			try {
				databaseDao.addCourse(course);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	public void addConditional(Course course) throws Exception{
		if(course.getPrice()<=0)
		{
			System.out.println("Course price cannot be less than zero ");
			System.out.println("Operation failed ");
		}
		else {
		for (Course courses: FakeData.courses) {
			if(courses.getName()==courses.getName())
			{
				System.out.println("This course is already in"+course.getName());
			}
			databaseDao.addCourse(course);
		}
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
		}

	}
		public  List<Course> getAllCourse()
		{
			return databaseDao.getCourseList();
		}
		
		
	}


