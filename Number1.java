public class Number1 {


	public static void main(String[] args) {
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 5 };
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		int sumAges = 0;
	    for (int age: ages) {
	    	sumAges = sumAges + age;
	    }
	    System.out.println("Average number of ages is "+sumAges/ages.length);
   } 
}


