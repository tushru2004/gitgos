package bfs;
import java.util.LinkedList;
import java.util.Queue;

import algos.TreeNode;

/**            1
			  / \
			 /   \
			/     \
			2       3
			/ \     /
			4   5   6
			/       / \
			7       8   9
****/
public class PathSum {

	public boolean hasPathSum (TreeNode<Integer> root, int sum)
	{
		LinkedList<TreeNode<Integer>> frontier = new LinkedList<TreeNode<Integer>>();
		LinkedList<Integer> values = new LinkedList<Integer>();
		
		if(root==null)
			return false;
	    
		if(root.getLeft() ==null && root.getRight() ==null)
		{
			return root.data.equals(sum);
		}
		
		
	
		frontier.add(root);
		values.add(root.data);

	    while(!frontier.isEmpty())
	    {
	        TreeNode<Integer> currentnode = frontier.poll();
	    	Integer sumfornode = values.poll();
	    	System.out.println(currentnode.data +" Sum for this node is" + sumfornode);
	    	if(sumfornode.equals(sum))
	    	{
	    		return true;
	    		
	    	}
	       
	        if(currentnode.left!=null)
		        {
	        	    frontier.add(currentnode.left);
		                     
		        	values.add(currentnode.getLeft().data + sumfornode);
	        	}
	        	
	        if(currentnode.right!=null)
	        	{
	        	    frontier.add(currentnode.right);
	        	    values.add(currentnode.getRight().data + sumfornode);
	        	}
	            
	    }
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeNode<Integer> one = new TreeNode<Integer>(1);
		  TreeNode<Integer> two = new TreeNode<Integer>(2);
		  TreeNode<Integer> three = new TreeNode<Integer>(3);
		  TreeNode<Integer> four = new TreeNode<Integer>(4);
		  TreeNode<Integer> five = new TreeNode<Integer>(5);
		  TreeNode<Integer> six = new TreeNode<Integer>(6);
		  TreeNode<Integer> seven = new TreeNode<Integer>(7);
		  TreeNode<Integer> eight = new TreeNode<Integer>(8);
		  TreeNode<Integer> nine = new TreeNode<Integer>(9);
		  
		  one.setLeft(two);
		  one.setRight(three);
		  
		  two.setLeft(four);
		  two.setRight(five);
		  /*three.setLeft(six);
		  four.setLeft(seven);
		  six.setLeft(eight);
		  six.setRight(nine);
		  */
		  int sum = 5;
		  System.out.println(new PathSum().hasPathSum(one ,sum));
	}

}
