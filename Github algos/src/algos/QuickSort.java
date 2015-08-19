package algos;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] input = {5,4};
       //int [] output= new QuickSort().Quick(input, 0, input.length-1);
       new QuickSort().Quick(input, 0, input.length-1);
       for(int i : input)
       {
    	   System.out.println(i);
       }
	}
	public int[] Quick(int [] input,int start,int end) {
		// TODO Auto-generated method stub
       if(input.length==0 || input.length==1) return input;
       if(start>=end) return input;
       
       int pos= Partition (input, start, end);
       printarray(input);
       Quick(input,0,pos-1);
       
       Quick(input,pos+1, input.length-1);
       
       return input;
	}
	public void printarray(int [] input)
	{
		System.out.println("Array output is");
		for(int i =0;i< input.length;i++)
		{
			System.out.print(i + " " );
			
		}
	}
	public int Partition(int [] A, int start, int end)
	{
		int pindex= start;
		int pivot = A[end];
		for(int i = start; i<end-1;i++)
		{
		    swap (A,i,pindex);
			pindex = pindex +1;
		}
		
		return pindex;
	}
	
	public void swap( int [] A , int swapone , int swaptwo)
	{
		int temp = A[swapone];
		A[swapone]= A[swaptwo];
		A[swaptwo]= temp;
		
	}
}
