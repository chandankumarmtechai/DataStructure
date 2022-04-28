import java.util.*;

class Node extends TreeNode
{
	int hd;
	public Node(TreeNode t, int hd)
	{
		super(t.data, t.left, t.right);
		this.hd = hd;
	}
	
	public int hashCode()
	{
		return this.hd;
	}
}

public class Traversal33
{
	static Hashtable table;
	public static void verticalTraversal(BinaryTree t)
	{
		table = new Hashtable(51);
		
		LinkedList list = new LinkedList();
		Node node = new Node(t.root, 26);
		Node temp;
		list.addLast(node);
		
		while(! list.isEmpty())
		{
			node = (Node)list.getFirst();
			list.removeFirst();
			table.put(node, node.data.toString());
			
			if(node.left != null)
			{
				temp = new Node(node.left, node.hd-1);
				list.addLast(temp);
			}
			if(node.right != null)
			{
				temp = new Node(node.right, node.hd+1);
				list.addLast(temp);
			}
		}
	}
	
	public static void main(String args[])
	{
		BinaryTree t = new BinaryTree();
	 	t.addNodes("[1 [2 [4 null null] [5 null null]] [3 null null]]");
	 	t.root.right.addLeftRight(6,7); 	
	 	
	 	verticalTraversal(t);
	 	System.out.println(table);
	 	
	 	 table.forEach( 
            (k, v) -> System.out.print(v)); 
	}
}
