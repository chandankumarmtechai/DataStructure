import java.util.*;

public class AllProduct
{
	public static void main(String args[])
	{
		int a = 8; 
		int b =9;
		TreeMap<Integer, String> map = new TreeMap<>();
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=b; j++)
			{
				map.put(i*j, "("+ i + "," + j +")");
			}
		}
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println((int)entry.getKey() + "=>" + (String)entry.getValue());
		}
	}
}
