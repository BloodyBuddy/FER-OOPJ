package hr.fer.oop.introduction;

public class ExtraT1 {
	public static void main(String[] args) {
		Node root = new Node(); // This is only used to demonstrate the purpose of packaging
		/* Considering that *all* of our classes are part of a PACKAGE (i.e. "included"), -
			Java knows how to handle them all together, and use them if necesarry, without -
			clogging up the "current" class.
		*/
		for (int i = 0; !args[i].equals("kraj"); i++) // *NEVER* use the typical == comparison -
		// with strings. Method for comparing the CONTENTS of strings is 
		// <stringname>.equals(<comparingstringname>);
			if (stringEq(args[i]) == true) System.out.println(args[i]);
	}
	
	public static boolean stringEq (String s){
		int vow = 0, con = 0;
		String vowels = new String("aeiouAEIOU"); // Marking down all vowels
		for (int i = 0; i<s.length(); i++)
			if (vowels.indexOf(s.charAt(i)) != -1) vow++; // *
			else con++;
		if (vow == con) return true;
		else return false;
	}
}

/* *<stringname>.indexOf(char c) --> Returns an int that represents the index of the	
	char c in string <stringname> if it exists. If not, returns -1;
	<stringname>.charAt(int i) --> Returns the CHARACTER on index i from string <stringname>;
	This was used because indexOf *requires* a char as parameter to work correctly.
*/