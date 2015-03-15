public class ProjectFour {

	public static boolean palinChecker(int guess) {

		boolean test = false;

		String answer = Integer.toString(guess);

		int[] answerArray = new int[answer.length()];

		for (int i = 0; i < answer.length(); i++) {

			char[] charArray = new char[answer.length()];
			charArray = answer.toCharArray();
			answerArray[i] = (Character.getNumericValue(charArray[i]));
		}

		for (int j = 0; j < answerArray.length; j++) {
			if (answerArray[j] == answerArray[(answerArray.length - 1) - j]) {
				test = true;
			} else {
				test = false;
				break;
			}
		}

		return test;
	}

	public static void main(String[] args) {

		boolean test = false;
		PalindromeChecker check = new PalindromeChecker();
		int testNumber = 0;
		int highestNumber = 0;

		for (int i = 999; i != 0; i--) {
			for (int j = 999; j != 0; j--) {
				testNumber = i * j;
				if (palinChecker(testNumber)) {
					highestNumber = (testNumber > highestNumber) ? testNumber
							: highestNumber;
					{

					}
				}
			}
		}
		System.out.println("The highest Palin is: " + highestNumber);
	}

}
