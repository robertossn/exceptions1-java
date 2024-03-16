package entities;

public class Department {

	
	private String name;
	private int age;
	
	public Department() {
		
	}

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private double getAge() {
		return age;
	}
	
}
