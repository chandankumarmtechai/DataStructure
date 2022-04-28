import java.util.*;

public class Traversal1
{
	public static int search(int arr[], int x, int n)
	{
		for(int i=0; i<n; i++)
		{
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void postorderFromInorderAndPreorder(int in[], int pre[], int n)
	{
		int root = search(in, pre[0], n);
		
		if(root !=0 )
			postorderFromInorderAndPreorder(in, Arrays.copyOfRange(pre, 1, n), root);
		if(root != n-1)
			postorderFromInorderAndPreorder(Arrays.copyOfRange(in, root+1, n), Arrays.copyOfRange(pre, root+1, n), n-root-1);
		
		System.out.print(pre[0]);
	}
	public static void main(String a[])
	{
		int in[] = { 4, 2, 5, 1, 3, 6 };
    	int pre[] = { 1, 2, 4, 5, 3, 6 };
    	int n = in.length;
    	postorderFromInorderAndPreorder(in, pre, n);
	}
}
