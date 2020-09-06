
public class Number11 {

	public static void main(String[] args) {
		// write a method that takes two arrays of double and returns
		// true if the average of the elements in the first array is
		// greater than the average of the elements in the second array
		
		double[] array1 = new double [] {6.0,6.5,5.0,7.5,8.0};
		double avgArray1 = (avgArray(array1));
		
		double[] array2 = new double [] {6.0,7.25,1.0,2.5,9.0};
		double avgArray2 = (avgArray(array2));
		
		if (avgArray1 > avgArray2) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}
	
    public static double avgArray (double[] values) {
    	double sum = 0;
    	for (double value : values) {
    		sum += value;
    	}
    	return sum / values.length;
    }

}


