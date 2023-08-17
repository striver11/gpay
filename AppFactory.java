package gpay;

import java.util.Scanner;

public class AppFactory {
	
	public static bank getBank() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 for SBI Bank");
			System.out.println("Press 2 for ICICI Bank");
			System.out.println("Press 3 for HDFC Bank");
			
			int userInput = sc.nextInt();
			
			switch (userInput) {
				case 1:
					return new SBI();
				case 2:
					return new ICICI();
				case 3:
					return new HDFC();
				default:
					System.out.println("Please enter a valid number");
			}
		}
	}
}
