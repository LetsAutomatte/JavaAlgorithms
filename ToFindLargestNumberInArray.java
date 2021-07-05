package Programs;

public class ToFindLargestNumberInArray {
	public static void main(String[] args)
	{
		int[] arr = new int[]{23,90,1,7,100,97,19,45};
		int max=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=max)
			max=arr[i];
			
		}
		
		System.out.println("max number is"+max);
	}

}
