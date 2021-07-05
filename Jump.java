package Programs;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] {2,3,1,1,4};
		
		int len = nums.length;
		
        int totalJump =0;
        boolean result = false;
        for(int i=0;i<=len-1;i++)
        {
        	 System.out.println("i--->>>"+i); 
            int jump = totalJump+nums[i];
            System.out.println("here"+jump);
             totalJump = totalJump+nums[i];
            if(totalJump==len-1)
            {
                result=true;
                break;
                
            }
            else if(totalJump>len-1)
            {
                result =false;
                break;
            }
            else
            {
          
                i = i+nums[i]-1;
              
            }
        }
      System.out.println(result) ;
    }
	}

