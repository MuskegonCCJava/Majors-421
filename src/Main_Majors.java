//	Main_Majors.java by Kyle Wolff and Brandon VanderMey

import java.util.Date;
import java.util.Scanner;


public class Main_Majors {
	
	enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};
	
	public static Date today = new Date();
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String userInput;
		
		System.out.println("Majors by Kyle Wolff and Brandon Vandermey " + today);
		System.out.print("Choose one :  ");
		
		for (Major maj : Major.values())
		{
			System.out.print(maj + " ");
		}
		
		System.out.print("\nEnter: ");
		userInput = scanner.nextLine().toUpperCase();
		
		
		switch (Major.valueOf(userInput))
		{
			case ACC:
			case CIS:
				System.out.println(userInput + " is in the Business Division");
				break;
			case CHEM:
			case PHYS:
				System.out.println(userInput + " is in the Science Division");
				break;
			case ENG:
			case HIS:
				System.out.println(userInput + " is in the Humanities Division");
				break;
		}
		
		System.out.print("\nProgram Closing...\nThank You");
	}
}
