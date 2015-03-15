
public class PalindromeChecker {

	
	public static boolean PalinTest(int guess){
		
		boolean test = false;
		
		String answer = Integer.toString(guess);
		
		int [] answerArray= new int[answer.length()];
		
		for(int i = 0; i<answer.length(); i++){
			
			char[] charArray = new char[answer.length()];
			charArray = answer.toCharArray(); 
			answerArray[i]= (Character.getNumericValue(charArray[i]));					
		}
		
		for(int j=0; j<answerArray.length;j++){
			if(answerArray[j]==answerArray[(answerArray.length-1)-j]){
				test =true;
			}else{
				test=false;
				break;
			}
		}
		
		
		return test;
	}
}
