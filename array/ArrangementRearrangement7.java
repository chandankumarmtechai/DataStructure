
public class ArrangementRearrangement7
{
	public static void moveZeros(int arr[])
	{
		int n = arr.length;
		int count = 0;
		int temp;
		for(int i=0; i<n; i++)
		{
			if(arr[i] != 0)
			{
				temp = arr[count];
				arr[count++] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {1,2,0,3,0,5,0};
		moveZeros(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
