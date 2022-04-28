import java.util.*;

public class Traversal28
{
	public static void leftBoundary(TreeNode node)
	{
		if(node == null)
			return;
		
		if(node.left != null)
		{
			System.out.print(node.data.toString()+" ");
			leftBoundary(node.left);
		}
		else if(node.right != null)
		{
			System.out.print(node.data.toString()+ " ");
			leftBoundary(node.right);
		}
	}
	public static void rightBoundary(TreeNode node)
	{
		if(node == null)
			return;
		
		if(node.right != null)
		{
			leftBoundary(node.right);
			System.out.print(node.data.toString()+ " ");
		}
		else if(node.left != null)
		{
			leftBoundary(node.left);
			System.out.print(node.data.toString()+ " ");
		}
	}
	public static void leaves(TreeNode node)
	{
		if(node == null)
			return;
		
		leaves(node.left);
		if(node.left == null && node.right == null)
			System.out.print(node.data.toString()+ " ");
		leaves(node.right);
	}
	public static void boundaryTraversal(BinaryTree t)
	{
		TreeNode temp = t.root;
		System.out.print(temp.data.toString()+" ");
		
		leftBoundary(temp.left);
		leaves(temp.left);
		leaves(temp.right);
		rightBoundary(temp.right);
	}
	
	public static void printPath(TreeNode node)
	{
		if(node == null)
			return;
		
		leaves(node.left);
		if(node.left == null && node.right == null)
			System.out.print(node.data.toString()+ " ");
		leaves(node.right);
	}
	public static void main(String args[])
	{
		BinaryTree t = new BinaryTree();
		
		t.root = new TreeNode(1);
		t.root.addLeftRight(2,3);
		t.root.left.addLeftRight(4,5);
		t.root.right.addLeftRight(6,7);
		
		boundaryTraversal(t);
	}
}
