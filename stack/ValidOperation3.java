import java.util.*;

public class ValidOperation3
{
	public static void sort(Stack inputStack, Stack tempStack)
	{
		while(! inputStack.isEmpty())
		{
			Integer temp = (Integer)inputStack.pop();
			while((! tempStack.isEmpty()) && (Integer)tempStack.peek() > temp)
			{
				Integer i = (Integer)tempStack.pop();
				inputStack.push(i);
			}
			tempStack.push(temp);
		}
	}
	public static void main(String a[])
	{
		Stack<Integer> inputStack = new Stack<Integer>();
		Stack<Integer> tempStack = new Stack<Integer>();
		
		inputStack.push(3);
		inputStack.push(2);
		inputStack.push(1);
		
		System.out.println(inputStack);//[3,2,1]
		sort(inputStack, tempStack);
		System.out.println(tempStack);//[1,2,3]
	}
}
