
public class ProjectTwo {

	
	public static void main(String[] args) {
		
		long total=0;
		long firstNumber=1;
		long secondNumber=1;
		long output=1;
		
		for (long i=1; i<=100000; i++)
		{
			if(output%2==0){
				total+=output;
			}
			
			System.out.println(output);
			output=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=output;	
			if(secondNumber>=4000000)
				break;
			
		}
		
		
		System.out.println(total);
		
		
	}
}
