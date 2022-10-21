import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.IDatabaseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;

public class Main {

	public static void main(String[] args) throws Exception {
	IDatabaseDao databaseDb=new HibernateDao();
	Logger[] loggers= {
			new DatabaseLogger(),
			new FileLogger(),
			new MailLogger()
	};
	
	Instructor  instructor=new Instructor(2, "Enes Bayram");
	Category category =new Category(4, "C++");
	Course course=new Course(1, "Mobile Pragramming ", 0, category, instructor);
	Course course2=new Course(2, "Mobile Programming", 200, category, instructor);
	Course course3=new Course(3, "Desktop Programming", 0, category, instructor);
	
	CategoryManager categoryManager=new CategoryManager(databaseDb, loggers);
	InstructorManager  instructorManager=new InstructorManager(databaseDb, loggers);
	CourseManager coursemanager=new CourseManager(databaseDb,loggers);
	
	categoryManager.add(category);
	System.out.println("\n");
	instructorManager.add(instructor);
	System.out.println("\n");
	coursemanager.add(course2);
	System.out.println("\n");
	coursemanager.addConditional(course);
	coursemanager.addConditional(course3);

	
	System.out.println("\n Courses: \n");
	for (Course c  : coursemanager.getAllCourse()) 
	{
		System.out.println(c.toString());
	}

	}

}
