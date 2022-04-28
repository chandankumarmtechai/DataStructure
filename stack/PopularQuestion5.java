import java.util.*;

public class PopularQuestion5
{
	public static String postfixToInfix(String expression)
	{
		Stack stack = new Stack();
		String operator = "+-*/";
		List list = new ArrayList();
		for (int i = 0; i < operator.length(); i++) {
            list.add(operator.charAt(i));
        }
		
		int l= expression.length();
		String s;
		
		System.out.println(operator);
		
		for(int i =0; i<l; i++)
		{
			if(list.contains(expression.charAt(i))) // operator
			{
				//System.out.println("operator");
				s = "("+(String)stack.pop() + expression.charAt(i) + (String)stack.pop() + ")";
				stack.push(s);
			}
			else//operand
			{
				//System.out.println("operand");
				stack.push(""+expression.charAt(i));
			}
		}
		return (String)stack.pop();
	}
	public static void main(String a[])
	{
		String expression = "ab+c*";
		
		String result = postfixToInfix(expression);
		System.out.println("postfix :" + expression);
		System.out.println("infix :" + result);		
	}
}
