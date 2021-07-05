package BigO;

// complexity best cas = O(1)
// worst/average case = O(Log N)
// example if 16 elements are there we need to divide the arrays for 4 times
// 16/2 =8 , 8/2 =4 , 4/2 = 2 , 2/2 = 1 which means 2*2*2*2 = 16

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{12,34,56,23,89,100,105,789}; //1
		int num = 789; //1
		int mid = arr.length/2; //1
	    int first =0;
		int last = arr.length-1;
		while(first<=last)
		{
			if(num==arr[mid])
			{
				System.out.println("Element found at"+mid);
				break;
			}
			else if(num>arr[mid])
			{
				first = mid+1;
			}
			else
			{
				last = mid-1;
			}
			
			mid= (first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Element not found");
		}

	}

}
