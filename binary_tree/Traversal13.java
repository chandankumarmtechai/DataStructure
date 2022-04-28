import java.util.*;

public class Traversal13
{
	public static String spiralTraversal(BinaryTree t)
	{
		TreeNode temp = t.root;
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		
		String result = "";
		
		stack1.push(temp);
		
		while(! stack1.isEmpty() || ! stack2.isEmpty())
		{
			while(! stack1.isEmpty())
			{
				temp = (TreeNode)stack1.pop();
				result = result + temp.data.toString();
				if(temp.right != null)
					stack2.push(temp.right);
				if(temp.left != null)
					stack2.push(temp.left);
			}
			while(! stack2.isEmpty())
			{
				temp = (TreeNode)stack2.pop();
				result = result + temp.data.toString();
				if(temp.left != null)
					stack1.push(temp.left);
				if(temp.right != null)
					stack1.push(temp.right);
			}
		}
		
		return result;
	}
	
	public static void main(String a[])
	{
		BinaryTree t = new BinaryTree();
	 	t.addNodes("[1 [2 [4 null null] [5 null null]] [3 null null]]");
	 	t.root.right.addLeftRight(6,7); 	
	 	System.out.println(spiralTraversal(t));	
	}
}
