public class ProjectFive {
	// 2520 is the smallest number that can be divided by
	// each of the numbers from 1 to 10 without any
	// remainder.
	// What is the smallest positive number that is
	// evenly divisible by all of the numbers from 1 to 20?

	public static boolean checkNumberTwoAndThree(int i) {

		if ((i % 2 == 0) && (i % 3 == 0))
			return true;

		return false;
	}

	public static boolean checkNumberFourAndFive(int i) {
		if ((i % 4 == 0) && (i % 5 == 0))
			return true;
		return false;
	}

	public static boolean checkNumberSixThroughTwenty(int i) {

		if ((i % 6 == 0) && (i % 7 == 0) && (i % 8 == 0) && (i % 9 == 0)
				&& (i % 10 == 0) && (i % 11 == 0) && (i % 12 == 0)
				&& (i % 13 == 0) && (i % 14 == 0) && (i % 15 == 0)
				&& (i % 16 == 0) && (i % 17 == 0) && (i % 18 == 0)
				&& (i % 19 == 0) && (i % 20 == 0))
			return true;

		return false;
	}

	
	public static void main(String[] args){
		
		for (int i = 1; i < 999999999; i++) {
			if((checkNumberTwoAndThree(i))&&(checkNumberFourAndFive(i))&&(checkNumberSixThroughTwenty(i))){
				System.out.println("The answer is: "+ i);
				break;
				
				
			}
			
		}
		
	}
	
}
