package egovframework.wini.main.vo;

public class MainVO {
	private String first_name;
	private String last_name;
	private int salary;
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	@Override
	public String toString() {
		return "MainVO [first_name=" + first_name + ", last_name=" + last_name + ", salary=" + salary + "]";
	}
}
