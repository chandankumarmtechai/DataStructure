 public class Sorting4
 {
 	public static void sort(int arr[])
 	{
 		int n = arr.length;
 		int temp = 0;
 		for(int i=0; i<n; i++)
 		{
 			if(i-1 >=0 && arr[i] < arr[i-1])
 			{
 				temp = arr[i];
 				arr[i] = arr[i-1];
 				arr[i-1] = temp;
 			}
 			if(i+1 < n && arr[i] < arr[i+1])
 			{
 				temp = arr[i];
 				arr[i] = arr[i+1];
 				arr[i+1] = temp;
 			}
 			i++;
 		}
 	}
 	public static void main(String args[])
 	{
 		int arr[] =  {10, 90, 49, 2, 1, 5, 23};
 		sort(arr);
 		
 		for(int i=0; i<arr.length; i++)
 			System.out.print(arr[i] + " ");
 	}
 }
