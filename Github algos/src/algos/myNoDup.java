package algos;

import java.util.Arrays;

public class myNoDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,8, 2, 2, 3, 3 ,5,6};
		arr=nodups(arr);
		System.out.println(arr.length);
		
		printarr(arr);
	}

	public static int [] nodups(int [] input)
	{
		int i=0;
		for(int j=1; j<input.length;j++)
		{
			
			if(input[j] != input[i])
			{
				i++;
				input[i]=input[j];
			}
			
		}
		
		return Arrays.copyOf(input,i+1);
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
