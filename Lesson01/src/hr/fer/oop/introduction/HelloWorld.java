package hr.fer.oop.introduction; // Can think of this as a type of #include from C

public class HelloWorld {
	public static void main(String[] args) {
		/* This particular version of our HelloWorld class does the following:
			1. Prints out the default "Hello World" message if there are no arguments;
			2. Prints out a greeting with the format of "Hello, <name>" if there is ONE argument;
			3. Calculates the sum of (assumed) numbers if there are >1 arguments;
			NOTE: there is *no* checker to see if the arguments *are* actually numbers,
				if there are more than one (third option). This can be done through a format
				checker --> Read "Dodatni zadaci za 1. predavanje"
		*/
		if (args.length == 1) System.out.printf("Hello, %s!", args[0]); 
		else if (args.length == 0) System.out.printf("Hello World!");
		else {
			double suma = 0;
			for (int i = 0; i<args.length; i++) {
				double broj = Double.parseDouble(args[i]);
				suma += broj;
			}
			System.out.printf("Sum is: %f%n", suma); // %n instead of \n to work for every OS
		}
	}
}