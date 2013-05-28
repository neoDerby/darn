package firstworld;

import java.util.ArrayList;

public class MergeSort {
	
	ArrayList sortedlist = new ArrayList<Integer>();
	public ArrayList<Integer> merge(int []a, int []b , int indexa , int indexb){		
		if(empty(a))
			return b;
		if(empty(b))
			return a;
		if(a[0] < b[0]) 
			return concat (a[0], merge(a,b, ++indexa, indexb));
		else
			return concat (b[0], merge(a,b,indexa, ++indexb));
	}
	private boolean empty (int []array)
	{
		if (array.length == 0) 
				return true;
		else 
			return false;
	}
	
	private ArrayList<Integer> concat(int firstElement, int [] list)
	{
		sortedlist.add(firstElement);
		sortedlist.add(list);		
		return sortedlist;
	}	
}
