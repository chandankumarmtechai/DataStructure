import java.util.*;

public class PopularQuestion1
{
	public static void infixToPostfix(String expression, char result[] )
	{
		Stack stack = new Stack();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('+', 1);
		map.put('-', 1);
		map.put('/', 2);
		map.put('*', 2);
		map.put('(',0);
		map.put(')',0);
		
		int l= expression.length();
		int rindex = 0;
		char c;
		
		for(int i =0; i<l; i++)
		{
			if(map.containsKey(expression.charAt(i)))
			{
				if(expression.charAt(i) == '(')
				{
					stack.push(expression.charAt(i));
				}
				else if(expression.charAt(i) == ')')
				{
					while(! stack.isEmpty())
					{
						c = (char)stack.pop();
						if(c == '(')
							break;
						result[rindex] = c;
						rindex++;
					}
				}
				else if(stack.isEmpty() || (Integer)map.get(expression.charAt(i)) <= (Integer)map.get(stack.peek()))
				{
					if(stack.isEmpty())
					{
						stack.push(expression.charAt(i));
						continue;
					}
					while((! stack.isEmpty()) && (Integer)map.get(expression.charAt(i)) <= (Integer)map.get(stack.peek()))
					{
						c = (char)stack.pop();
						result[rindex] = c;
						rindex++;
					}
					stack.push(expression.charAt(i));
				}
				else
				{
					stack.push(expression.charAt(i));
					System.out.println(expression.charAt(i));
				}
			}
			else
			{
				result[rindex] = expression.charAt(i);
				rindex++;
			}
		}
		while(! stack.isEmpty())
			{
				c = (char)stack.pop();
				result[rindex] = c;
				rindex++;
			}
	}
	public static void main(String a[])
	{
		String expression = "a+b*c/d";
		char result[] = new char[expression.length()];
		
		infixToPostfix(expression, result);
		System.out.println("infix :" + expression);
		System.out.println("postfix :" + new String(result));	
		
		expression = "a+b*c/d+(e-f)";
		char result2[] = new char[expression.length()];
		infixToPostfix(expression, result2);
		System.out.println("infix :" + expression);
		System.out.println("postfix :" + new String(result2));	
	}
}
