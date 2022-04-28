import java.util.*;

public class ValidOperation9
{
	public static void printReverseWord(String text)
	{
		Stack s = new Stack();
		int l = text.length();
		for(int i=0; i<l; i++)
		{
			if(text.charAt(i) == ' ' || i == l-1)
			{
				if(i == l-1)
					s.push(text.charAt(i));
				while(! s.isEmpty())
				{
					System.out.print(s.pop());
				}
				System.out.print(" ");
			}
			else
			{
				s.push(text.charAt(i));
			}
		}
	}
	
	public static void main(String a[])
	{
		String line = "mango apple orange";
		printReverseWord(line);
	}
} 
