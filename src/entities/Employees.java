package entities;

public class Employees {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employees() {
	}
	
	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void increase(Double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return  id + ", " + name + ", "
				+ String.format("%.2f", salary);
	}
}
