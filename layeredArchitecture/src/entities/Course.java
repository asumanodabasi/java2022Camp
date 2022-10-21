package entities;

public class Course {
	private int id;
	private String name;
	private float price;
	private Category category;
	private Instructor instructor;
	
	
	public Course(int id, String name, float price, Category category, Instructor instructor) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.instructor = instructor;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getCategoryName() {
		return category.getName();
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public String getInstructor() {
		return instructor.getName();
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString()
	{
		return "Course Name : "+name+ " TL : "+price + " Category Name: "+ category.getName()+ " Instructor Name: "+instructor.getName();
	}
	
}