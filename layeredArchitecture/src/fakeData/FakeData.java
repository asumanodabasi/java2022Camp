package fakeData;

import java.util.ArrayList;
import java.util.List;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class FakeData {
	public static List<Category> categories=new ArrayList<Category>(){{
		add(new Category(1,"C#"));
		add(new Category(2,"Java"));
		add(new Category(3,"Spring"));
		
	}};
	public static List<Instructor> instructors=new ArrayList<Instructor>() {{
		add(new Instructor(1,"Engin Demiroğ"));
	}}; 
	
	public static List<Course> courses=new ArrayList<Course>() {{}};
}
