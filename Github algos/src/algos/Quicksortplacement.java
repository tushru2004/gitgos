package algos;

import java.util.Arrays;

public class Quicksortplacement {

	// Create an array with all unique elements
		public static void putinrightpos(int[] A) {
		    int i=-1;
			int pivot = A[A.length-1];
			
			for(int j=0;j< A.length;j++){
				
				if(A[j]<pivot)
				{
					i++;
					if(i<A.length){
						System.out.println(i + " "+ j +" " + A[i]+ " "+A[j]);

						swap(A,i,j);
					}
				}
			    //if(	i<A.length)

			}
			i++;
			if(i<A.length)
			{
			   swap (A,i,A.length-1);
			}
			
		}
		public static void swap( int [] A , int swapone , int swaptwo)
		{
			int temp = A[swapone];
			A[swapone]= A[swaptwo];
			A[swaptwo]= temp;
			
		}
		public static void main(String[] args) {
			int[] arr = { 2,1,8,6,3,5};
			 putinrightpos(arr);
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
