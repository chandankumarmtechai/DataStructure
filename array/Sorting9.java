import java.util.*;

public class Sorting9
 {
 	public static void sort(int arr[])
 	{
 		int n = arr.length;
 		Map<Integer, Integer> map = new LinkedHashMap<>();
 		
 		for(int i=0; i<n; i++)
 		{
 			if(map.containsKey(arr[i]))
 			{
 				map.put(arr[i], map.get(arr[i])+1);
 			}
 			else
 			{
 				map.put(arr[i], 1);
 			}
 		}
 		
 		int count = 0;
 		for(Map.Entry<Integer, Integer> entry : map.entrySet())
 		{
 			int key = entry.getKey();
 			int value = entry.getValue();
 			for(int j=0; j<value; j++)
 			{
 				arr[count++] = key;
 			}
 		}
 		
 		for(int i=1; i<n; i++)
 		{
 			int key = arr[i];
 			int j=i-1;	
 			while(j>=0 && map.get(arr[j]) < map.get(key))
 			{
 				arr[j+1] = arr[j];
 				j--;
 			}
 			arr[j+1] = key;
 		}
 	}
 	public static void main(String args[])
 	{
 		int arr[] =  {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
 		sort(arr);
 		
 		for(int i=0; i<arr.length; i++)
 			System.out.print(arr[i] + " ");
 		System.out.println();
 	}
 }
