package org.foobarspam.decimalformat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Resources {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print("Enter the loan amount: ");
			double principle = scan.nextDouble();
			System.out.print("Enter the interest rate: ");
			double rate = scan.nextDouble();
			System.out.print("Enter the loan term (in years): ");
			double years = scan.nextInt();
			double interest = principle * rate * years;
			double total = principle + interest;
			double payment = total / years / 12;
			DecimalFormat df = new DecimalFormat("0.##");
			System.out.println("Monthly payment: $" + df.format(payment));
		} catch (Exception exc) {
			System.out.println(exc);
		} finally {
			scan.close();
		}
	}
}
