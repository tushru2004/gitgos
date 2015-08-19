package algos;

public class maxproductsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-2,11,-8};
		int prod= 1;
		int maxprod = arr[0];
		int prev =1;
	    /*for(int i =0;i< arr.length ; i++)
	    {   
		   prod = prod * arr[i];
		   if(prod>maxprod )
		   {
			   maxprod = Math.max(prod ,arr[i] ) ;
		   }
		   else
		   {
			   maxprod= Math.max(maxprod, Math.max(prod, arr[i]*prev));			   
		   }
	       prev=arr[i];
		   System.out.println("maxprod is "+maxprod + " prod is "+ prod + " prev "+ prev);
		   
	    }
	   */
	   System.out.println(new maxproductsubarray().maxprod(arr));
	}
	
	public int maxprod(int [] A)
	{
		int maxprodtillhere = 1;
		int globalmax=A[0];
		int prev=1;
	    for(int i =0; i< A.length ; i++)
	    {
	    	
	    	maxprodtillhere =maxprodtillhere * A[i];
	    	
	    	
	        if(A[i] > maxprodtillhere )
	    	{
	    		maxprodtillhere =  Math.max(A[i], A[i]*prev);
	    		
	    	}
	        if(maxprodtillhere > globalmax)
	    	{
	    		
	    		globalmax= maxprodtillhere; 
	    	}
	    	
	        prev=A[i];
	    	System.out.println("global max "+ globalmax + " maxprdtillhere "+ maxprodtillhere +" A[i] "+ A[i] + " Iteration number "+ i);
	    }
		return globalmax;
	}
	

}
