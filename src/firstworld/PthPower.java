package firstworld;
/*
An integer X is a "perfect square power" if there is some integer Y such that Y2 = X. An integer X is a "perfect cube power" if there is some integer Y such that Y3 = X. We can extrapolate this where P is the power in question: an integer X is a "perfect p'th power" if there is some integer Y such that YP = X.
Your goal is to find the highest value of P for a given X such that for some unknown integer Y, YP should equal X. You can expect the given input integer X to be within the range of an unsigned 32-bit integer (0 to 4,294,967,295).
Special thanks to the ACM collegiate programming challenges group for giving me the initial idea here.
Formal Inputs & Outputs
Input Description
You will be given a single integer on a single line of text through standard console input. This integer will range from 0 to 4,294,967,295 (the limits of a 32-bit unsigned integer).
Output Description
You must print out to standard console the highest value P that fits the above problem description's requirements.
Sample Inputs & Outputs
Sample Input
Note: These are all considered separate input examples.
17

1073741824

25
Sample Output
Note: The string following the result are notes to help with understanding the example; it is NOT expected of you to write this out.
1 (17^1)

30 (2^30)

2 (5^2)
*/
public class PthPower {	
	double findPthPower(long X){
		
		double P = 1;
		double Y = 0;
		long bestValue = 1;
		do{
			Y =  Math.pow(X, 1/P);			
			bestValue = Y == Math.floor(Y) ? (long)P:bestValue; 
			P++;			
		} while(Y > 2);		
		return bestValue;		
	}
}
