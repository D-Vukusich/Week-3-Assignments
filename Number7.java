
public class Number7 {

	public static void main(String[] args) {
		// write a method that takes a string, word, and an int, n, as arguments
		// and returns the word concatenated to itself n number of times.
		
		System.out.println(multiplyString("hello",3));
		
}
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	

}
