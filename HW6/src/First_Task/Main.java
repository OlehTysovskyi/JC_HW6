package First_Task;

public class Main {

	public static void main(String[] args) {
		
		Worker_HourPay wh = new Worker_HourPay("Ivan", 24, 25.56);
		Worker_FixedPay wf = new Worker_FixedPay("Andrew", 44, 2300);
		wh.PersonSalary();
		wf.PersonSalary();
	}

}
