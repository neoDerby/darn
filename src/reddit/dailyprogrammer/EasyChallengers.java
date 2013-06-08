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
	
	/*
	 * (Easy): McCarthy 91 Function
		The McCarthy 91 Function is a recursive function which, given an integer N, returns the integer 91 if N is equal to or smaller than 100, or simply N-10 if N is greater than 100. Sounds simple, but look at the function definition in the linked Wikipedia article! How could such a function work to always return a constant (for N <= 100) that isn't in the function body? Well, that's your task: write out each step that McCarthy's function does for a given integer N.
		Author: nint22
		Formal Inputs & Outputs
		Input Description
		You will be given a single integer N on standard console input. This integer will range between 0 and 2,147,483,647 (without commas).
		Output Description
		You must output what the function does on each recursion: first you must print the function the expression that is being computed, and then print which condition it took. Simply put, you must print each recursion event in the following string format: "<Expression being executed> since <is greater than | is equal to or less than> 100". Note that for the first line you do not need to print the "since" string (see example below). You should also print the final expression, which is the result (which should always be 91).
		Sample Inputs & Outputs
		Sample Input
		Note: Take from Wikipedia for the sake of keeping things as simple and clear as possible.
		99
		Sample Output
		M(99)
		M(M(110)) since 99 is equal to or less than 100
		M(100) since 110 is greater than 100
		M(M(111)) since 100 is equal to or less than 100
		M(101) since 111 is greater than 100
		91 since 101 is greater than 100
		91
	 */
	
	long solveMcCarthy91(long n){
		
		if (n == 91) {
			System.out.println(n);
			return n;
		}					
		if(n > 100){
			
			System.out.println("M(" + (n-10) + ")" + " since " + n + " is greater than 100");
			return n -10;
			//solveMcCarthy91(n-10);			
		}
		else {					
			System.out.println("M(M(" + (n+11) + "))" + " since " + n + " is equal to or less 100");
			solveMcCarthy91(n+11);
		}
		return n;
	}	
}
