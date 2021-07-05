package BigO;

import java.util.HashMap;

public class BIGTC {
	
	public static void main(String args[])
	{
		int n=1; // O(1) as the code is executed once
		System.out.println(n);
		
		// if number is even 
		n= 20;
		if(n%2==0) // O(1) as the code is executed once
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		
		
		//adding and Fetching values in hashmap
		//O(1)
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // executed once 
		map.put("Tom", 100);  //executed once
		map.put("Peter", 90); // excecuted once 
		map.put("Wills", 80); // excecuted once 
		System.out.println("tom marks"+map.get("Tom"));// excecuted once 
		// so the time complexity is O(1);
		
		//printing nimber 1 to 10
		// TC is O(n) as code is executed n(n is number of elements) times
		int n1 = 10;
		for(int i=1;i<=n1;i++)
		{
			System.out.println(i);
		}
		
		// i =1 executed once
		// 1<=n1  exected n number of times
		// i++  exected n number of times
		// System.out.println(i);    exected n number of times
		// 1+3n  (1 is constant can ignored
		//3n = n = O(n)
		//which is equal to number of elements thats why it is equal to O(n)
		
		//algo to find the greatest number
				int[] arr = new int[]{23,90,1,7,100,97,19,45};
		int max=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=max)
			max=arr[i];
			
		}
				System.out.println("max number is"+max);
				
				
				
	// 00 01 02 03
	//10 11 12 13
	//20 21 22 23
    // complexity will be O(n^2)
	for(int i=0;i<=3;i++)  // 1+i+i = 1+2i
	{
		for(int j=0;j<=3;j++) // 1+j+j = 1+2j
		{
			System.out.print(i);
			System.out.print(j);
			System.out.print(" ");
		}
		System.out.println("");
	}
				
	

	
	// Program to write duplicat in the array
	// for this also complexity is O(n^2)
	
	int[] dup = new int[]{67,90,12,67,90,12,78,54,34}; 
	
	for(int i=0;i<=dup.length-1;i++) // executed n timnes
	{
		for(int j =0;j<=dup.length-1;j++) // executed n*n or n^2 times
		{
			if(dup[i]==dup[j])
			{
				System.out.println("duplicatenumber is"+dup[i]);
			}
		}
		
	}
	
	// three loops 
	// O(n^3)
	for(int i=0;i<=dup.length-1;i++) // executed n timnes
	{
		for(int j =0;j<=dup.length-1;j++) // executed n*n or n^2 times
		{
			for(int k =0;k<=dup.length-1;k++) // executed n*n or n^2 times
			{
				
			}
		}
	}
	
}
}
