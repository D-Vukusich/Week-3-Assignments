
public class Number9 {

	public static void main(String[] args) {
		// Write a method that takes an array of int and returns true
		// if the sum of all the ints in the array is greater than 100

		int[] array1 = new int [5];
		
		array1[0]=25;
		array1[1]=33;
		array1[2]=11;
		array1[3]=34;
		array1[4]=9;
		
		int sumArray1 = (sumArray(array1));
		
		
		if (sumArray1 > 100) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
	
    private static int sumArray(int[] array1) {
		return 0;
	}
}





