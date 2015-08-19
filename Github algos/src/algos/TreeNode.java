package algos;

public class TreeNode<T>
{
	 public TreeNode<T> left;
	 public TreeNode<T> right;
	 public T data;
	 public TreeNode(T data)
	 {
	  this.data = data;
	 }
	 public TreeNode<T> getLeft()
	 {
	  return this.left;
	 }
	 public void setLeft(TreeNode<T> left)
	 {
	  this.left = left;
	 }
	 public TreeNode<T> getRight()
	 {
	  return this.right;
	 }
	 public void setRight(TreeNode<T> right)
	 {
	  this.right = right;
	 }
}
