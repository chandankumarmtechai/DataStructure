
public class SegregateEvenOdd
{
	public static void segregateEvenOdd(int arr[])
	{
		int n = arr.length;
	
		for(int i=1; i<n; i++)
		{
			int j = i-1;
			int key = arr[i];
			if(key % 2 == 1)
				continue;
			while(j>=0 && arr[j] % 2 == 1)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		segregateEvenOdd(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
