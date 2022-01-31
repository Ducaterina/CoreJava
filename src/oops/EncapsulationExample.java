package oops;

public class EncapsulationExample {
	
	//you can change functions in this class without impacting the Runner class
	
	private String FirstName;
	private int BasicSalary;
	private String Company;
	public String getName() {
		return FirstName;
	}
	public void setName(String name) {
		FirstName = name;
	}
	public int getSalary() {
		return BasicSalary;
	}
	public void setSalary(int salary) {
		BasicSalary = salary;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	


}
