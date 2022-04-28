public class Heap8
{
	public static void heapify(int arr[], int n, int i)
	{
		int l = 2*i +1;
		int r = 2*i +2;
		int largest =i;
		
		if(l<n && arr[l] > arr[largest])
			largest = l;
		if(r<n && arr[r] > arr[largest])
			largest = r;
		if(largest != i)
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}
	public static void buildMaxHeap(int arr[])
	{
		int n = arr.length;
		for(int i=n/2; i>=0; i--)
		{
			heapify(arr, n, i);
		}
	}
	public static void sort(int arr[])
	{
		int n = arr.length;
		buildMaxHeap(arr);
		for(int i=n-1; i>0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);		}
	}
	public static void main(String args[])
	{
		int arr[] = {5,4,3,2,1};
		sort(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
