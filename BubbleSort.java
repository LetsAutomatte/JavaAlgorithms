package BigO;

// worst case {5,4,3,2,1} - (n-1)+(n-2)+(n-3) --  = O(n^2)
// best case {1,2,3,4,5}  - )        no swapping -     O(n)

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr = new int[]{45,12,9,45,79,23,56}; // 
		int swapCount=0;
		for(int j=0;j<=arr.length-1;j++)
		{
		for(int i=1;i<=arr.length-i;i++) // executed n-i times 
		{
			
		if(arr[i]>arr[i+1])
		{
			swapCount =	swapCount+1;
			swap(arr[i],arr[i+1],arr,i);
		}
		
		}
		}
		printElemments(arr);
		
	}
	
	public static void swap(int a, int b,int[] arr,int i)
	{
		int temp = a;
		arr[i] = b;
		arr[i+1]=temp;
	
	}

	public static void printElemments(int[] arr)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
