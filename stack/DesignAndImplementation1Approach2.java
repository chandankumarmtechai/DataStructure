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
	public Object dequeue()
	{
		Object temp;
		if(this.isEmpty())
			return null;
		
		while(!(s1.isEmpty()))
		{
			temp = s1.pop();
			s2.push(temp);
		}
		return (s2.pop());
	}
	
	public void enqueue(Object o)
	{
		s1.push(o);
	}
	
	public boolean isEmpty()
	{
		if(s1.isEmpty() && s2.isEmpty())
			return true;
		else 
			return false;
	}
	
	public String  toString()
	{
		return this.s1.toString(); // need to be implemeted carefully
	}
}

public class DesignAndImplementation1Approach2
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
