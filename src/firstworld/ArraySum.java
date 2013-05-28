package firstworld;

public class ArraySum {
	
    public static int arraySumAux(int[] a, int low, int high) { 

        if (low == high) 
           { return 0; }
        else  // low < high
           { return arraySumAux(a, low, high-1) + a[high-1]; }
     }
}
