package ua.lviv.lgs;

import java.util.Scanner;

public class InputHowMuch {
	
	public static int howMuch() {
		System.out.println("Input how much Fibanachi numbers needed(integer value, please):");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		if (scanner.hasNextInt()) {
			count = scanner.nextInt();

		} else {
			System.out.println("Try again next time, please. Exiting...");
			System.exit(0);
		}

		scanner.close();
		return count;
		
	}
	
}
