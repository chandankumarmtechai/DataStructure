import java.util.*;

public class ValidOperation2
{
	public static void insertSorted(Stack s, Integer i)
	{
		if(s.isEmpty() || i > (Integer)s.peek())
		{
			s.push(i);
			return;
		}
		Integer temp = (Integer)s.pop();
		insertSorted(s,i);
		s.push(temp);
	}
	
	public static void sort(Stack s)
	{
		Integer i;
		if(s.isEmpty())
		{
			return;
		}
		
		i = (Integer)s.pop();
		sort(s);
		insertSorted(s,i);
	}
	public static void main(String a[])
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println(s);//[3,2,1]
		sort(s);
		System.out.println(s);//[1,2,3]	
	}
}
