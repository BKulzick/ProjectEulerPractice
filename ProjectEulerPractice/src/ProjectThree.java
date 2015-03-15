
public class ProjectThree {

	public static void main(String[] args) {
		
		long prime;
		long answer=600851475143L;
		long total=35; //35 because 5 and 7 are not found by the prime tester
		for(long i=1;i<=answer;i++){
			//   false   false   false   false
			if(!((i%2==0)||(i%3==0)||(i%5==0)||(i%7==0))){  //prime tester
				prime=i;
							
				if(answer%prime==0){
					total*=prime;
					System.out.println(total);
					if (total>=answer){
					System.out.println("This is the answer:" +prime);
					break;
					}
				}
			
			}
		}
	}	
}


