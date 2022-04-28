import java.util.*;

class MyQueue
{
	private Stack s1;
	private Stack s2;
	
	public MyQueue()
	{
		this.s1 = new Stack();
		this.s2 = new Stack();
	}
	public void enqueue(Object o)
	{
		Object temp;
		while(!(s1.isEmpty()))
		{
			temp = s1.pop();
			s2.push(temp);
		}
		
		s1.push(o);
		while(!(s2.isEmpty()))
		{
			temp = s2.pop();
			s1.push(temp);
		}
		
	}
	
	public Object dequeue()
	{
		if(this.isEmpty())
			return null;
		return (s1.pop());
	}
	
	public boolean isEmpty()
	{
		if(s1.isEmpty())
			return true;
		else 
			return false;
	}
	
	public String  toString()
	{
		return this.s1.toString();
	}
}

public class DesignAndImplementation1
{
	public static void main(String a[])
	{
		MyQueue queue = new MyQueue();
		System.out.println(queue.isEmpty());
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		System.out.println(queue);  //[3,2,1]
		
		while(!(queue.isEmpty()))
		{
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println(); // 1 2 3
	}
}
