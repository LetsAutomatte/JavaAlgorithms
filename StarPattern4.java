package Programs;

public class StarPattern4 {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i-1;j--)
			{
				System.out.print(" ");
				
				
			}
			for(int k=1;k<i+1;k++)
			{
				System.out.print("*");	
			}
			System.out.println("");
			
		}
	
	}

}

/*

*
**
***
****
*****
****
***
**
*
 */
 
