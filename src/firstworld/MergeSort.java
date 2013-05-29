package firstworld;

import java.util.ArrayList;

public class MergeSort {	
	public  ArrayList<Integer> mergesort(ArrayList<Integer> a){
		if (a.size() == 1)
			return a; // it is already sorted		
	    int mid = (a.size()/2);
	    ArrayList<Integer>  lefthalf = new ArrayList<Integer>();
	    ArrayList<Integer>  righthalf = new ArrayList<Integer>();
	    
	    for (int i = 0 ; i < mid ; i ++)
	    	lefthalf.add(a.remove(0));
	    while (!a.isEmpty())
	    	righthalf.add(a.remove(0));		    
		return merge( mergesort(lefthalf), mergesort( righthalf));
	}
	private  ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){		
		if(a.isEmpty())
			return b;
		if(b.isEmpty())
			return a;
		if(a.get(0).intValue() < b.get(0).intValue())
			return concat (a.remove(0), merge(a,b));
		else
			return concat (b.remove(0), merge(a,b));
	}		
	private ArrayList<Integer> concat(int elem, ArrayList<Integer> list){
		ArrayList<Integer>  sortedlist = new ArrayList<Integer>();
		sortedlist.add(elem);
		sortedlist.addAll(list)	;
		return sortedlist;
	}
}
