package algos;

public class maxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-11,-2,-3,-4,-5};
	   System.out.println("Max sum is "+new maxsubarray().maxSubArray(arr));
	}
	
	public int maxSubArray(int[] A) {
		int maxtillhere = 0;
		int maxSum = A[0];
        int start=0;
        int end=0;
        
		for (int i = 0; i < A.length; i++) {
			
			
			maxtillhere += A[i];
			
	        
			if(A[i]>maxtillhere)
			{
				maxtillhere = A[i];
				if(A[i]>maxSum)
				{
					start=i;
					end=i;
				}
			}
			
							
			
			if(maxtillhere>maxSum)
			{		
				maxSum = maxtillhere;				
				end=i;				
			}
			System.out.println(" Iteration "+ i + " Sum "+maxtillhere + " Start "+start + " End "+ end);
 
			
		}
 
		return maxSum;
	}

}
