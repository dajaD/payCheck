package workbookJava.employeeSalary;


public class salary {
	private static double baseHours = 40.0;
	private static double overtime = 1.5;

	private double hoursWorked;
	private double pay;

	public void setHours(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}

	public void sethourlyPay(double pay)
	{
		this.pay = pay;
	}

	public double calculatedGross()
	{
		return hoursWorked > 40 ?
		(pay * baseHours) + ((pay * overtime) * (hoursWorked - baseHours)): hoursWorked * pay;
	}
}
