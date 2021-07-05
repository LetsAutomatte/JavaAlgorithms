package Programs;

import java.util.ArrayList;

public class DuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> dupArr = new ArrayList<String>();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("a");
		arr.add("e");
		arr.add("f");
		arr.add("b");
		for(int j=0;j<=arr.size()-1;j++)
		{
		for(int i=j+1;i<=arr.size()-1;i++)
		{
			if(arr.get(j)==arr.get(i))
			{
				
				dupArr.add(arr.get(i));	
			}
		}
				
	}
		printDup(dupArr);
	}
public static void 	printDup(ArrayList<String> dupArr)
{
	for(int j=0;j<=dupArr.size()-1;j++) {
		System.out.println(dupArr.get(j));
	}
}

}
