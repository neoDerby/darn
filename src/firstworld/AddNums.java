package firstworld;

public class AddNums {	
	
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
}
