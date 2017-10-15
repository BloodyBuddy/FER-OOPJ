package hr.fer.oop.lab1.prob1;
import java.util.Scanner;

public class Rectangle {
	private double width;
	private double height;
	private double area;
	private double perimeter;
	private static final Scanner sc = new Scanner (System.in);
	
	public Rectangle (String[] args) {
		if (args.length == 0) {
			this.width = fetchInput("width");
			this.height = fetchInput("height");
		}
		else if (args.length != 2) {
			// Required output, not exception.
			// throw new IllegalArgumentException("Invalid number of arguments was provided.");
			System.out.println("Invalid number of arguments was provided.");
			System.exit(0);
		}
		else {
			this.width = Double.parseDouble(args[0]);
			this.height = Double.parseDouble(args[1]);
		}
	}
	
	private static double fetchInput(String type) {
		String current;	
		while (true) {
			System.out.print("Please provide " + type + ": ");
			current = sc.nextLine().trim();
			if (current.isEmpty() == true) {
				// Instead of throwing an exception, simply printing a warning so program won't terminate.
				// throw new IllegalArgumentException("The input must not be blank.");
				System.out.println("The input must not be blank.");
			}
			else {
				double parsedNumber = Double.parseDouble(current);
				if (parsedNumber < 0) {
					// Instead of throwing an exception, simply printing a warning so program won't terminate.
					// throw new IllegalArgumentException("The " + type + " must not be negative.");
					System.out.println("The " + type + " must not be negative.");
				}
				else return parsedNumber;
			}
		}
	}

	private void calculate() {
		this.area = this.height*this.width;
		this.perimeter = this.height*2 + this.width*2;
	}
	
	private void output() {
		System.out.printf("You have specified a rectangle with a width of "
				+ "%.1f and height of %.1f. Its area is "
				+ "%.1f and its perimeter is %.1f.", 
				this.width, this.height,
				this.area, this.perimeter);
	}
	
	public static void main(String[] args) {
		Rectangle prvi = new Rectangle(args);
		prvi.calculate();
		prvi.output();
		sc.close();
	}
}
