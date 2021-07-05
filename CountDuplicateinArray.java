package Programs;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String,Integer> dupMap = new HashMap<String,Integer>();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("a");
		arr.add("e");
		arr.add("f");
		arr.add("b");
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("a");
		arr.add("e");
		arr.add("f");
		arr.add("b");
		for(int i=0;i<=arr.size()-1;i++)
		{
			//for(int j=1;j<=arr.size()-2;j++)
			//if(arr.get(i)==arr.get(j))
			//{
				if(dupMap.containsKey(arr.get(i)))
				{
					
				
					dupMap.put(arr.get(i), dupMap.get(arr.get(i))+1);
				}
			
					
			else
			{
				dupMap.put(arr.get(i), 1);
			}
		}
		//}
		
		printDup(dupMap);
	}
public static void 	printDup( HashMap<String,Integer>  dupHashmap)
{
	for (String key : dupHashmap.keySet())
    {
		System.out.println(key+"---"+dupHashmap.get(key));
		
    }
}

}
