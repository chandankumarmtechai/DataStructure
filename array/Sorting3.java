import java.util.*;

public class Sorting3
 {
 	public static void sort(int arr[], int x)
 	{
 		int n = arr.length;
 		int diff[] = new int[n];
 		for(int i=0; i<n; i++)
 			diff[i] = Math.abs(x - arr[i]);
 		
 		for(int i=1; i<n; i++)
 		{
 			int key = diff[i];
 			int value = arr[i];
 			int j=i-1;	
 			while(j>=0 && diff[j] > key)
 			{
 				diff[j+1] = diff[j];
 				arr[j+1] = arr[j];
 				j--;
 			}
 			diff[j+1] = key;
 			arr[j+1] = value;
 		}
 	}
 	public static void main(String args[])
 	{
 		int arr[] =  {10, 5, 3, 9 ,2};
 		int x = 7;
 		sort(arr, x);
 		
 		for(int i=0; i<arr.length; i++)
 			System.out.print(arr[i] + " ");
 		System.out.println();
 	}
 }
