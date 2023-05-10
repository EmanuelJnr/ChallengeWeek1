package Question01;

public class Employee {
	private String name;
	private float salary;
	private float bonus;
	private float liqSalary;
	
	public Employee(String name, float salary) {
		setName(name);
		setSalary(salary);
		calcLiqSalary();
	}
	public void calcLiqSalary() {
		if(salary<=1000) {
			bonus+=salary*0.20;
			liqSalary=salary+bonus;
		}
		else if(salary>1000 && salary<=2000){
			bonus+=salary*0.10;
			liqSalary=salary+bonus;
		}
		else if(salary>2000){
			bonus+=salary*0.10;
			liqSalary=salary-bonus;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public float getLiqSalary() {
		return liqSalary;
	}
}