
public class Number8 {

	public static void main(String[] args) {
		
		// a method that takes two strings and returns a full name separated by a space
		String firstName = "Derek";
		String lastName = "Vukusich";
		String fullName = printFullName(firstName, lastName);
		
		System.out.println(fullName);

	}
	
	public static String printFullName (String x, String y) {
		return x + " " + y;
	}

}
