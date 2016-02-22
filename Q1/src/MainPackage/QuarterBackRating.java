package MainPackage;

import java.util.Scanner;
import java.text.NumberFormat;

public class QuarterBackRating {
	private static double TouchdownsScored;
	private static double TotalYards;
	private static double Interceptions;
	private static double Completions;
	private static double Attempts;
	private static double QBRating;

	public static void main(String[] args) {
		UserInput();
		System.out.println("The QB Rating is" +QBRating(TouchdownsScored, TotalYards, Interceptions, Completions, Attempts));

	}



	public static void UserInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of touchdowns scored:");
		TouchdownsScored = input.nextDouble();

		System.out.println("Enter the amount of total yards:");
		TotalYards = input.nextDouble();

		System.out.println("Enter the amount of interceptions thrown:");
		Interceptions = input.nextDouble();

		System.out.println("Enter the amount of completions thrown:");
		Completions = input.nextDouble();

		System.out.println("Enter the amount of passes attempted:");
		Attempts = input.nextDouble();

	}

	private static double QBRating(double touchdownsScored, double totalYards, double interceptions,
			double completions, double attempts) {
		
			double a = ((Completions / Attempts) - .3) * 5;
			double b = ((TotalYards / Attempts) - 3) * .25;
			double c = (TouchdownsScored / Attempts) * 20;
			double d = 2.375 - ((Interceptions / Attempts) * 25);
			QBRating=((a+b+c+d)/6)*100;
			return QBRating;
		
			
	}
		


}
