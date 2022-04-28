import java.util.*;

public class Traversal14
{
	public static String levelOrderTraversalByLine(BinaryTree t)
	{
		LinkedList list = new LinkedList();
		TreeNode temp = t.root;
		String result = "";
		Object obj = null;
		list.addLast(temp);
		list.addLast("\n");
		
		while(list.size() > 1)
		{
			obj = list.getFirst();
			list.removeFirst();
			if(obj instanceof String)
			{
				result = result + "\n";
				list.addLast("\n");
				continue;
			}
			
			temp = (TreeNode)obj;
			result = result + temp.data.toString();
			if(temp.left != null)
			{
				list.addLast(temp.left);	
			}
			if(temp.right != null)
			{
				list.addLast(temp.right);	
			}
		}
		return result;
	}
	public static void main(String a[])
	{
		BinaryTree t = new BinaryTree();
	 	t.addNodes("[1 [2 [4 null null] [5 null null]] [3 null null]]");
	 	System.out.println(t.inorder());
	 	
	 	System.out.println(levelOrderTraversalByLine(t));	
	}
}
