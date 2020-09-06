
public class Number2b {

	public static void main(String[] args) {
		// average letters per name in an array of strings
		// concatenate all the names together, separated by spaces
		
				String names [] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
				int sumNameChars=0;
				for (int i = 0; i < names.length; i++) {
					int indSumNameChars = names[i].length();
					sumNameChars = sumNameChars+indSumNameChars;
				}
				System.out.println(sumNameChars/names.length);
				
				for (int i = 0; i<names.length; i++) {
					System.out.print(" " + names[i]);
				}

			}

		}