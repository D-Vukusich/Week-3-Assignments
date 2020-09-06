
public class Number5 {

	public static void main(String[] args) {
		// Create a new array of int called nameLengths. Write a loop to 
		//iterate over the previously created names array and add the length 
		//of each name to the nameLengths array.

		String names [] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		int totalSumOfNameChars=0;
		for (int i = 0; i<names.length; i++){
			int indivSumOfNameChars = names[i].length();
			totalSumOfNameChars = totalSumOfNameChars + indivSumOfNameChars;			
		}
		System.out.println(totalSumOfNameChars);	
		}	    	
	}
