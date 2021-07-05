package DataStructure.Searching;

public class SubListserach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // Best Case O(m*n)
	int[] list1 = new int[] {12,78,90,45};	
	int[] list2 = new int[]  {1};	
	boolean found = false;
	
	for(int i=0;i<=list2.length-1;i++)
	{
		for(int j=0;j<=list1.length-1;j++)
		{
			if(list2[i]==list1[j])
			{
				found = true;
				
					
			}
			
		}
		if(found)
		{
			continue;
		}
		else
		{
			System.out.println("Not Found");
			break;
		}
	}
	if(found)
	{
		System.out.println("sublist");
	}
	}

}
