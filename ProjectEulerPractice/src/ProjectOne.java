public class ProjectOne {

	// If we list all the natural numbers below 10 that are
	// multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is
	// 23.
	// Find the sum of all the multiples of 3 or 5 below 1000.

	public static int sumOfMultliplesOfThreeAndFive(int belowThisNumber) {
		int total = 0;
		for (int i = 0; i < belowThisNumber; i++) {
			if ((i % 3 == 0) || (i % 5 == 0))
				total += i;
		}

		return total;
	}

	public static void main(String[] args) {

		int belowThisNumber = 1000;

		System.out.println(sumOfMultliplesOfThreeAndFive(belowThisNumber));

	}

}
