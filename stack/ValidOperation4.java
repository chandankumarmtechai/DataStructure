

class StackNode
{
	int data;
	StackNode next;
	
	public StackNode(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class MyStack
{
	StackNode top,temp;
	
	public void push(int data)
	{
		if(this.top == null)
		{
			top = new StackNode(data);
			return;
		}
		temp = new StackNode(data);
		temp.next = this.top;
		this.top = temp;
	}
	
	public StackNode pop()
	{
		StackNode s = this.top;
		if(this.top != null)
			this.top = this.top.next;
		return s;
	}
	
	public void reverse()
	{
		StackNode prev, cur, succ;
        cur = prev = this.top;
        cur = cur.next;
        prev.next = null;
        while (cur != null)
        {
            succ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = succ;
        }
        this.top = prev;
	}
	
	public void display()
    {
        StackNode s = this.top;
        while (s != null) {
            System.out.print(s.data + " ");
            s = s.next;
        }
        System.out.println();
    }
}
public class ValidOperation4
{
	public static void main(String a[])
	{
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.display();// 3 2 1
		s.reverse();
		s.display();// 1 2 3 
	}
}
