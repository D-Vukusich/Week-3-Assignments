
public class Number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		  * Create a new array of int called nameLengths. Write a loop to iterate over the previously
		  * created names array and add the length of each name to the nameLengths array.
		  * ~Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to console.~
		  */
		      String names [] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};

		      int[] nameLengths = new int[names.length];
		      for (int i = 0; i < names.length; i++) {
			  nameLengths[i] = names[i].length();
		      }

		      int totalSumOfNameChars=0;
		      for (int i = 0; i < names.length; i++) {
		        totalSumOfNameChars += nameLengths[i];
		      }
		      System.out.println(totalSumOfNameChars);
		     }

	}


