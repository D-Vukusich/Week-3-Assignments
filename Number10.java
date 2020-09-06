
public class Number10 {

	public static void main(String[] args) {
		// return average of doubles in array

		double[] dubAvArray = new double [5];
		
		dubAvArray[0] = 2.0;
		dubAvArray[1] = 2.5;
		dubAvArray[2] = 5.0;
		dubAvArray[3] = 8.5;
		dubAvArray[4] = 10.0;
		
		System.out.println (avgArray(dubAvArray));
	}
	public static double avgArray (double[] values) {
		double sum = 0;
		for (double value : values) {
			sum += value;
		}
		return sum /values.length;
		
	}

}
