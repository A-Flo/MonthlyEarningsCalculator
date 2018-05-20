/*
 * Audra Flores
 *
 */

import java.util.Scanner;

public class MonthlyEarnings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double monthlyEarnings = 0.00;
		double totalTax = 0.07;
		String userChar = "!q";
		double month = 0.00;
		double total = 0.00;

		System.out.print("Hello, let's calculate your monthly earnings!" + '\n' + '\n');

		for (int i = 1; i <= 4; i++) {

			System.out.println("Enter your earnings for month " + i + ":");

			month = scan.nextDouble();
			monthlyEarnings = monthlyEarnings + month;

			System.out.println(" ");
		}

		total = monthlyEarnings;
		System.out.println("Your total earnings for the 4 month period is: " + "$" + total);
		System.out.println(" ");

		totalTax = (totalTax * total);
		System.out.println("You paid: " + "$" + (float) totalTax + " in taxes" + '\n');

		total = (total - totalTax);

		System.out.println("Your earnings after paying taxes are: " + "$" + (float)total);
		}

	}
