import java.util.*;

public class ValidOperation1
{
	public static void insertAtBottom(Stack s, Object o)
	{
		if(s.isEmpty())
		{
			s.push(o);
			return;
		}
		Object temp = s.pop();
		insertAtBottom(s,o);
		s.push(temp);
	}
	
	public static void reverse(Stack s)
	{
		Object o;
		System.out.println(s);
		if(s.isEmpty())
		{
			return;
		}
		
		o = s.pop();
		reverse(s);
		insertAtBottom(s,o);
		System.out.println(s);
	}
	public static void main(String a[])
	{
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		reverse(s);
		/* output be like
			[1, 2, 3]
			[1, 2]
			[1]
			[]
			[1]
			[2, 1]
			[3, 2, 1]
		*/
	}
}
