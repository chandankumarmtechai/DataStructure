import java.util.*;

class TreeNode
{
	Object data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(Object data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(Object data, TreeNode left, TreeNode right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public void addLeft(Object left)
	{
		this.left = new TreeNode(left);
	}
	
	public void addRight(Object right)
	{
		this.right = new TreeNode(right);
	}
	
	public void addLeftRight(Object left, Object right)
	{
		this.left = new TreeNode(left);
		this.right = new TreeNode(right);
	}
	
	public String toString()
	{
		if(this.left == null && this.right == null)
			return "["+this.data.toString()+" null"+" null"+"]";
		if(this.left != null && this.right == null)
			return "["+this.data.toString()+" " + this.left.toString()+" null"+"]";
		if(this.left == null && this.right != null)
			return "["+this.data.toString()+" null"+" "+this.right.toString()+"]";
		if(this.left != null && this.right != null)
			return "["+this.data.toString()+" "+this.left.toString()+" "+this.right.toString()+"]";
		return "["+this.data.toString()+" "+this.left.toString()+" "+this.right.toString()+"]";
	}
}

public class BinaryTree
{
	TreeNode root;
	
	public BinaryTree()
	{
		this.root = null;
	}
	
	public void addNodes(String tree)
	{
		TreeNode left=null;
		TreeNode right=null;
		TreeNode root;
		
		Stack s = new Stack();
		int l = tree.length();
		String token = "";
		for(int i= 0; i<l; i++)
		{
			if(tree.charAt(i) == '[')
			{
				s.push(tree.charAt(i) + "");
				System.out.println("push" + s.peek());
			}
			else if(tree.charAt(i) == ' ')
			{
				if(token != "")
				{
					s.push(token);
					System.out.println("push" + s.peek());
				}
				token = "";
			}
			else if(tree.charAt(i) == ']')
			{
				if(token != "")
				{
					s.push(token);
					System.out.println("push" + s.peek());
					token = "";
				}
				Object rightpop = s.pop();
				System.out.println("pop" + rightpop);
				Object leftpop = s.pop();
				System.out.println("pop" + leftpop);
				if(leftpop instanceof String)
				{
					left = null;
				}
				else
				{
					left = (TreeNode)leftpop;
				}
				if(rightpop instanceof String)
				{
					right = null;
				}
				else
				{
					right = (TreeNode)rightpop;
				}
				
				String roottext = (String)s.pop();
				System.out.println("pop" + roottext);
				System.out.println("pop" + s.pop());
				//s.pop();
				root = new TreeNode(roottext);
				root.left = left;
				root.right = right;
				s.push(root);
				System.out.println("push" + s.peek());
			}
			else
			{
				token = token + tree.charAt(i);
			}
		}
		this.root = (TreeNode)s.pop();
	}
	
	public TreeNode traverseLeft(TreeNode temp, Stack s)
	{
		while(temp != null)
		{
			s.push(temp);
			temp=temp.left;
		}
		return temp;
	}
	
	public String inorder()
	{
		Stack stack = new Stack();
		TreeNode poped;
		TreeNode root = this.root;
		String result = "";
		
		while(root != null || !(stack.isEmpty()))
		{
			root = traverseLeft(root, stack);
			poped = (TreeNode)stack.pop();
			result = result + poped.data.toString() + " ";
			root = poped.right;
		}
		
		return result;
	}
	
	public String preorder()
	{
		Stack stack = new Stack();
		TreeNode poped;
		TreeNode root = this.root;
		String result = "";
		if(root != null)
			stack.push(root);
		
		while(!(stack.isEmpty()))
		{
			poped = (TreeNode)stack.pop();
			result = result + poped.data.toString() + " ";
			if(poped.right != null)
			{
				stack.push(poped.right);
			}
			if(poped.left != null)
			{
				stack.push(poped.left);
			}
		}
		return result;
	}
	
	public String postorder()
	{
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		TreeNode poped;
		TreeNode root = this.root;
		String result = "";
		if(root != null)
			stack1.push(root);
		
		while(!(stack1.isEmpty()))
		{
			poped = (TreeNode)stack1.pop();
			stack2.push(poped);
			if(poped.left != null)
			{
				stack1.push(poped.left);
			}
			if(poped.right != null)
			{
				stack1.push(poped.right);
			}
		}
		while(! stack2.isEmpty())
		{
			result = result + ((TreeNode)stack2.pop()).data.toString() + " ";
		}
		return result;
	}
}
