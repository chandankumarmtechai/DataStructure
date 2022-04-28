

public class BinaryTreeTest
{
	public static void main(String a[])
	{
		BinaryTree t = new BinaryTree();
		t.root = new TreeNode(1);
		t.root.addLeft(2);
		t.root.addRight(3);
		t.root.left.addLeftRight(4,5);
		//System.out.println(t.root);
		System.out.println(t.postorder());
		
		String tree = "[1 [2 [4 null null] [5 null null]] [3 null null]]";
		BinaryTree t2 = new BinaryTree();
		//t2.addNodes(tree);
		
		//System.out.println(t2.inorder());
	}
}
