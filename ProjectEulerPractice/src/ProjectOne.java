
public class ProjectOne {

	public static void main(String[] args) {
		
		double threeTotal=0;
		double fiveTotal=0;
		
		for (double i=3; i<1000; i++)
		{
			if((i%3==0)||(i%5==0))
				threeTotal+=i;
		}
		
		
		System.out.println(threeTotal);
		
		
		
		System.out.println(threeTotal+fiveTotal);
	}

}
