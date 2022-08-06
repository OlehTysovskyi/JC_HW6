package First_Task;

public class Worker_FixedPay implements Salary {

	private String name;
	private int age;
	private double salaryMonthly;
	
	Worker_FixedPay(String name, int age, double salaryMonthly){
		this.name = name;
		this.age = age;
		this.salaryMonthly = salaryMonthly;
	}
	
	@Override
	public void PersonSalary() {
		System.out.println(name + "[age= " + age + "; salary= " + salaryMonthly + "/month]" );
	}
}
