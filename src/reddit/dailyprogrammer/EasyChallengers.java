package reddit.dailyprogrammer;

public class EasyChallengers {
	
	
	void listAddedNumbers(long input) {		
		do {
			
			input = addNumbers(input);
			System.out.println("sum:" + input);
		}while (input > 9);				
	}
	long addNumbers(long input){				
		long lastdigit = input % 10;
		input = input / 10;
		if( input == 0)
			return lastdigit;
		else
			return  lastdigit + addNumbers (input);
	}
	
	
	long solveMcCarthy91(long n){
		
		if (n == 91) {
			System.out.println(n);
			return n;
		}					
		if(n > 100){
			
			System.out.println("M(" + (n-10) + ")" + " since " + n + " is greater than 100");
			solveMcCarthy91(n-10);			
		}
		else {					
			System.out.println("M(M(" + (n+11) + "))" + " since " + n + " is equal to or less 100");
			solveMcCarthy91(n+11);
		}
		return n;
	}	
}
