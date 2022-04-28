import java.util.*;

class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return 1;
	}
}

public class Traversal12
{
	public static String levelOrderTraversal(BinaryTree t)
	{
		PriorityQueue q = new PriorityQueue(new MyComparator());
		TreeNode temp = t.root;
		String result = "";
		q.offer(temp);
		
		while(! q.isEmpty())
		{
			temp = (TreeNode)q.poll();
			result = result + temp.data.toString();
			if(temp.left != null)
				q.offer(temp.left);
			if(temp.right != null)
				q.offer(temp.right);
		}
		return result;
	}
	public static void main(String a[])
	{
		BinaryTree t = new BinaryTree();
	 	t.addNodes("[1 [2 [4 null null] [5 null null]] [3 null null]]");
	 	System.out.println(t.inorder());
	 	
	 	System.out.println(levelOrderTraversal(t));	
	}
}
