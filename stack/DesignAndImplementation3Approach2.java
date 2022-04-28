class MyStack
{
	static int top1;
	static int top2;
	static Object arr[];
	
	public static boolean isFull()
	{
		if(top1+1 == top2)
			return true;
		return false;
	}
	
	public static String toString1()
	{
		StringBuffer sb = new StringBuffer("[");
		for(int i = 0; i<= top1; i++)
		{
			sb.append(arr[i].toString() + ", ");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
	
	public static String toString2()
	{
		StringBuffer sb = new StringBuffer("[");
		for(int i = arr.length-1; i>=top2; i--)
		{
			sb.append(arr[i].toString() + ", ");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
}

class Stack1 extends MyStack
{
	public static void createStack1(int top, Object a[])
	{
		top1 = top;
		arr = a;
	}
	public static void push(Object o)
	{
		if(! isFull())
		{
			arr[++top1] = o;
		}
	}
	
	public static Object pop()
	{
		if(! isEmpty())
			return arr[top1--];
		return null;
	}
	
	public static boolean isEmpty()
	{
		if(top1 == -1)
			return true;
		return false;
	}
	public String toString()
	{
		return toString1();		
	}
}

class Stack2 extends MyStack
{
	public static void createStack2(int top, Object a[])
	{
		top2 = top;
		arr = a;
	}
	public static void push(Object o)
	{
		if(! isFull())
			arr[--top2] = o;
	}
	
	public static Object pop()
	{
		if(! isEmpty())
			return arr[top2++];
		return null;
	}
	
	public static boolean isEmpty()
	{
		if(top2 == arr.length)
			return true;
		return false;
	}
	
	public String toString()
	{
		return toString2();
	}
}

public class DesignAndImplementation3Approach2
{
	public static void main(String args[])
	{
		Object arr[] = new Object[6];
		Stack1 s1 = new Stack1();
		s1.createStack1(-1, arr);
		
		Stack2	 s2 = new Stack2();
		s2.createStack2(arr.length, arr);
		
		System.out.println(s1.isEmpty()); // false
		s1.push(1);
		s1.push(2);
		
		System.out.println(s1.isEmpty());//false
		System.out.println(s1);// [1,2]
		
		s2.push(6);
		s2.push(5);
		s2.push(4);
		s2.push(3);
		System.out.println(s2.isEmpty());//false
		System.out.println(s2);//[6,5,4,3]
		System.out.println(s2.isFull()); //true
		
		System.out.println(s1.pop());//2
		System.out.println(s1.isFull());//false
		System.out.println(s1);//[1]
		
		s2.push(2);
		System.out.println(s2);//[6,5,4,3,2]
		System.out.println(s2.isFull());//true
		
		s1.push(0);
		System.out.println(s1);//[1]
		s2.push(0);
		System.out.println(s2);//[6,5,4,3,2]
		
	}
}
