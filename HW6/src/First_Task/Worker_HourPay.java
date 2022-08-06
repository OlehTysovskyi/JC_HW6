package First_Task;

public class Worker_HourPay implements Salary {
	
	private String name;
	private int age;
	private double salaryPerHour;
	
	Worker_HourPay(String name, int age, double salaryPerHour){
		this.name = name;
		this.age = age;
		this.salaryPerHour = salaryPerHour;
	}
	
	@Override
	public void PersonSalary() {
		System.out.println(name + "[age= " + age + "; salary= " + salaryPerHour + "/hour]" );
	}
	
	
}
