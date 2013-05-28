package firstworld;

import java.util.Arrays;

public class SayHello {
	public static void main(String rgs[]){
		System.out.println("Hello World");
		System.out.println("Hello Again");
		System.out.println("Third one");
		System.out.println("ok last one");
		System.out.println("Final CHECK");
		
		int a [] = new int[] {3,4,5,6};
		System.out.println("Sum of list:" + Arrays.toString(a) + " is " + ArraySum.arraySumAux(a, 0, 4));
	}
}
