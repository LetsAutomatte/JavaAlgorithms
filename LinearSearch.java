package DataStructure.Searching;

public class LinearSearch {

	//best case O(1)
	// worst case O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {29,70,90,12,78,34,87,23,14};
		int key = 100;
		int count =0;
		boolean found = false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				count =i;
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("Number found at position"+count);
		}
		else
		{
			System.out.println("Not found");
		}
		
	}

}
