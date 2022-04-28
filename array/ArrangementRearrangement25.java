
public class ArrangementRearrangement25
{
	public static void seregateEvenOdd(int arr[])
	{
		int n = arr.length;
		int count = 0;
		int temp;
		for(int i=0; i<n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				temp = arr[count];
				arr[count++] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		seregateEvenOdd(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
