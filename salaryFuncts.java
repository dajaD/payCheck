package workbookJava.employeeSalary;

import java.util.Scanner;
//takes user input for number of employees, hours worked, and their gross pay.
public class salaryFuncts 
{
	public static void main(String[] args) 
	{
		System.out.println("What are the total number of employees who worked");
		Scanner scan = new Scanner(System.in);
		int emNumb = scan.nextInt();
		salary salaryContd = new salary();

		for (int i = 0; i < emNumb; i++) 
		{
			System.out.printf("Employee %d weekly hours: ", i);
			salaryContd.setHours(scan.nextDouble());

			System.out.printf("Employee %d hourly pay: ", i);
			salaryContd.sethourlyPay(scan.nextDouble());
			System.out.printf("employee %d gross pay: %.2f\n", i, salaryContd.calculatedGross());
		}
	}	
}
