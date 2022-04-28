
public class ArrangementRearrangement18
{
	public static void maxMin(int arr[])
	{
		int n = arr.length;
		int max = arr[n-1] +1 ;
		int maxIndex = n-1;
		int minIndex = 0;
		
		for(int i=0; i<n; i++)
		{
			if(i % 2 == 0)
			{
				arr[i] = arr[i] + arr[maxIndex] % max * max;
				maxIndex--;
			}
			else
			{
				arr[i] = arr[i] + arr[minIndex] % max * max;
				minIndex++;
			}
		}
		
		for(int i=0; i<n; i++)
			arr[i] = arr[i] / max;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5};
		maxMin(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
