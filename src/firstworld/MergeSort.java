package firstworld;

import java.util.ArrayList;

public class MergeSort {
	
	public  ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){		
		if(a.isEmpty())
			return b;
		if(b.isEmpty())
			return a;
		if(a.get(0).intValue() < b.get(0).intValue())
			return concat (a.remove(0), merge(a,b));
		else
			return concat (b.remove(0), merge(a,b));
	}
	private ArrayList<Integer> concat(int elem, ArrayList<Integer> list)
	{
		ArrayList<Integer>  sortedlist = new ArrayList<Integer>();
		sortedlist.add(elem);
		sortedlist.addAll(list)	;
		return sortedlist;
	}	
}
