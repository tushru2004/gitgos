package algos;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {3,1,0,8};
	       
		Integer minimum = input[0];
		Integer secondminimum = input[1];
		
		for(int i =0;i< input.length;i++)
		{
			if(input[i] < minimum)
			{
				secondminimum = minimum;
				minimum = input[i];				
			}
			else if( input[i] > minimum && input[i] < secondminimum )
			{
				
				secondminimum = input[i];
			}
				
			
		}
		System.out.println(minimum);
		System.out.println(secondminimum);
	    System.out.println(input);
	}

}
