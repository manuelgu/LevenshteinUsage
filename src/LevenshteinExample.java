import java.util.Scanner;

public class LevenshteinExample {
	
	private static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		String input = s.nextLine();
		
		// example valids
		sendCorrection(input, new String[] { "help", "commands", "find", "remove", "add", "edittext", "addmember", "removemember", "purge" });
	}

	private static void sendCorrection(String input, String[] options) {
		String closest = Levenshtein.getClosestString(input, options);
		if (closest.equals("")) {
			System.out.println("Sorry, we could not find a fitting correction.");
			return;
		}

		System.out.println("Did you mean " + closest + "?");
	}
}