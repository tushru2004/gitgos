package algos;

import java.util.Arrays;

public class Nodup {
	
	// Create an array with all unique elements
	public static int[] removeDuplicates(int[] A) {
		if (A.length < 2)
			return A;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
	 
		int[] B = Arrays.copyOf(A, j + 1);
	 
		return B;
	}
	 
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		arr = removeDuplicates(arr);
		System.out.println(arr.length);
		
		printarr(arr);
	}
    
	public static void printarr(int [] input)
	{
		System.out.println();
		for(int i : input)
		{
			System.out.print(" " + i);
		}
		System.out.println();
	}
}
