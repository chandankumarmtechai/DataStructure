import java.util.*;

class MyStack
{
	int top;
	int minTop;
	int maxTop;
	Object arr[];
	public MyStack(int minTop, int maxTop, Object arr[])
	{
		this.top = minTop;
		this.minTop = minTop;
		this.maxTop = maxTop;
		this.arr = arr;
	}
	public boolean isEmpty()
	{
		if(top == minTop)
			return true;
		return false;
	}
	
	public boolean isFull()
	{
		if(top == maxTop)
			return true;
		return false;
	}
	
	public void push(Object o)
	{
		if(! this.isFull())
		{
			arr[++top] = o;
		}
	}
	
	public Object pop()
	{
		if(this.isEmpty())
			return null;
		return arr[top--];
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer("[");
		for(int i = minTop+1; i<= top; i++)
		{
			sb.append(arr[i].toString() + ", ");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
}

public class DesignAndImplementation3
{
	public static void main(String a[])
	{
		Object array[] = new Object[6];
		int s = array.length;
		MyStack s1 = new MyStack(-1, s/2-1, array);
		MyStack s2 = new MyStack(s/2-1, s-1, array);
		
		System.out.println(s1.isEmpty());
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		System.out.println(s1);
		System.out.println(s1.isFull());
		
		s2.push(5);
		s2.push(6);
		s2.push(7);
		s2.push(8);
		System.out.println(s2);
		System.out.println(s2.isFull());
		
	}
}
