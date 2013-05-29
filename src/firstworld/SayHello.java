package firstworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import firstworld.MergeSort;

public class SayHello {
	public static void main(String rgs[]){
		//System.out.println("Hello World");
		//System.out.println("Hello Again");
		//System.out.println("Third one");
		//System.out.println("ok last one");
		//System.out.println("Final CHECK");
		
		//int a [] = new int[] {3,4,5,6};
		//System.out.println("Sum of list:" + Arrays.toString(a) + " is " + ArraySum.arraySumAux(a, 0, 4));
			
		//ArrayList<Integer> arl1 = new ArrayList<Integer>(Arrays.asList(0, 3,4, 5, 9));
		//ArrayList<Integer> arl2 = new ArrayList<Integer>(Arrays.asList(1, 2 ,6, 7, 8));
		ArrayList<Integer> unsorted = new ArrayList<Integer>(Arrays.asList(10,18, 5, 1));
		System.out.println( "The unsorted list is :" +  unsorted.toString());
		/*
		System.out.println( "The unsorted sorted list is :" +  unsorted.toString());
		int mid = (unsorted.size()/2);
		for (int i = 0 ; i < mid ; i++)
			System.out.println(unsorted.remove(0));
		
		System.out.println( "The unsorted sorted list half size :" +  unsorted.size());
		
		while (!unsorted.isEmpty())
			System.out.println(unsorted.remove(0));
		*/
		MergeSort ms = new MergeSort();
		//System.out.println( "The sorted list is :" +  ms.merge(arl1, arl2).toString());
		System.out.println( "The sorted list is :" +  ms.mergesort(unsorted).toString());
	}		
}
